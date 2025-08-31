package com.forest.algorithm.list;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Forest Dong
 * @date 2025年08月31日 10:19
 */
public class ArrayListSerializationTest {

    int s;

    public static void main(String[] args) throws Exception {
        // 真实 ArrayList
        ArrayList<String> realList = new ArrayList<>(1000); // 容量1000
        realList.add("A");
        realList.add("B");

        // 自定义 MyArrayList（不加 transient）
        MyArrayList<String> myList = new MyArrayList<>(1000);
        myList.add("A");
        myList.add("B");

        // 序列化真实 ArrayList
        byte[] realData = serialize(realList);
        System.out.println("Real ArrayList 序列化字节长度: " + realData.length);

        // 序列化自定义 MyArrayList
        byte[] myData = serialize(myList);
        System.out.println("MyArrayList(无transient) 序列化字节长度: " + myData.length);

        // 反序列化验证
        ArrayList<String> realList2 = (ArrayList<String>) deserialize(realData);
        MyArrayList<String> myList2 = (MyArrayList<String>) deserialize(myData);
        System.out.println("反序列化后的 realList: " + realList2);
        System.out.println("反序列化后的 myList: " + myList2);
    }

    private static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        oos.close();
        return bos.toByteArray();
    }

    private static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        return ois.readObject();
    }
}

/**
 * 模拟一个ArrayList，但 elementData 不加 transient
 */
class MyArrayList<E> implements Serializable {
    private Object[] elementData;
    private int size;

    public MyArrayList(int capacity) {
        this.elementData = new Object[capacity];
    }

    public boolean add(E e) {
        elementData[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(elementData[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
