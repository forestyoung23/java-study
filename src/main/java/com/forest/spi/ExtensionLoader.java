package com.forest.spi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 加载和管理扩展
 *
 * @author Forest Dong
 * @date 2021年12月02日 14:45
 */
public class ExtensionLoader<T> {
    /**
     * extensionLoader holder
     */
    private static final ConcurrentMap<Class<?>, ExtensionLoader<?>> extensionLoaderHolder = new ConcurrentHashMap<>();

    /**
     * 初始化标识
     */
    private static boolean init;

    /**
     * extension holder
     */
    private static final ConcurrentMap<String, Class<?>> extensionHolder = new ConcurrentHashMap<>();

    /**
     * 加载目录
     */
    private static final String BASE_DIR = "META-INF/services/";

    /**
     * 类型
     */
    private static Class<?> type;

    /**
     * 类加载器
     */
    private static ClassLoader classLoader;

    /**
     * 参数构造
     *
     * @param type
     * @param classLoader
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午4:06
     */
    private ExtensionLoader(Class<?> type, ClassLoader classLoader) {
        ExtensionLoader.type = type;
        ExtensionLoader.classLoader = classLoader;
    }

    /**
     * 获取extensionLoader
     *
     * @param type
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午3:28
     */
    public static <T> ExtensionLoader<T> getExtensionLoader(Class<T> type) {
        checkType(type);
        ExtensionLoader<T> loader = (ExtensionLoader<T>) extensionLoaderHolder.get(type);
        if (null == loader) {
            extensionLoaderHolder.putIfAbsent(type, new ExtensionLoader<>(type, Thread.currentThread().getContextClassLoader()));
            loader = (ExtensionLoader<T>) extensionLoaderHolder.get(type);
        }
        return loader;
    }

    /**
     * 获取扩展类实例
     *
     * @param name
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午3:29
     */
    public T getExtension(String name) {
        if (!init) {
            // 初始化
            doInit();
        }
        Class<?> clazz = extensionHolder.get(name);
        if (null == clazz) {
            throw new RuntimeException("can not found " + name);
        }
        return getInstance(clazz);
    }

    private T getInstance(Class<?> clazz) {
        T instance = null;
        try {
            instance = (T) clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return instance;
    }

    /**
     * 初始化
     * 1.读取配置文件
     * 2.获取class保存到extensionHolder
     *
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午3:56
     */
    private synchronized void doInit() {
        if (!init) {
            try {
                loadConfigFile();
            } catch (IOException e) {
                System.err.println("加载文件失败");
            }
        }
        init = true;
    }

    /**
     * 加载配置文件
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午4:11
     */
    public void loadConfigFile() throws IOException {
        Enumeration<URL> resources = classLoader.getResources(BASE_DIR + type.getName());
        if (!resources.hasMoreElements()) {
            throw new FileNotFoundException("can not find " + type.getName() + " in " + BASE_DIR);
        }
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            try (BufferedReader reader = new BufferedReader(new FileReader(url.getPath()))) {
                String str;
                while ((str = reader.readLine()) != null) {
                    if (str.length() == 0 || str.startsWith("#")) {
                        continue;
                    }
                    Class<?> clazz = Class.forName(str);
                    checkClass(clazz);
                    extensionHolder.putIfAbsent(clazz.getSimpleName(), clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private void checkClass(Class<?> clazz) {
        if (!type.isAssignableFrom(clazz)) {
            throw new RuntimeException("not supported");
        }
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            if (Modifier.PUBLIC == constructor.getModifiers()) {
                return;
            }
        }
        throw new RuntimeException("not supported");
    }

    /**
     * type合法性校验
     *
     * @param type
     * @return
     * @author Forest Dong
     * @date 2021/12/2 下午3:28
     */
    private static <T> void checkType(Class<T> type) {
        if (null == type) {
            throw new IllegalArgumentException("type can not be null");
        }
        if (!type.isInterface()) {
            throw new IllegalArgumentException("type should be interface");
        }
        if (!type.isAnnotationPresent(Extension.class)) {
            throw new IllegalArgumentException("type should have @Extension annotation");
        }
    }

    public static void main(String[] args) {
        Car bus = getExtensionLoader(Car.class).getExtension("Bike");
        System.err.println(bus.run());
    }
}
