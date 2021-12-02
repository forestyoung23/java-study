package com.forest.spi;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ServiceLoader<Car> load = ServiceLoader.load(Car.class);
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.err.println(Car.class.getName());
        Enumeration<URL> resources = loader.getResources("META-INF/services/" + Car.class.getName());
        URL url = resources.nextElement();
        System.err.println(url);
        Iterator<Car> iterator = load.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.err.println(car.run());
        }
    }
}
