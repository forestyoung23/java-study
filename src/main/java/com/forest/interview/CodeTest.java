package com.forest.interview;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author dongyang
 * @date 2021年06月06日 13:24
 */
public class CodeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "hello 你好";
        byte[] bytes = str.getBytes("UTF-8");
        String s = new String(bytes, "ISO-8859-1");
        System.err.println(s);
        s.substring(20);
        LinkedList<String> list = new LinkedList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add("q3");
        list.addFirst("q3");
        list.addLast("q3");
    }
}
