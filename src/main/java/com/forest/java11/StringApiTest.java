package com.forest.java11;

/**
 * String增强API
 *
 * @author dongyang
 * @date 2021年07月12日 11:38
 */
public class StringApiTest {
    public static void main(String[] args) {
        var s = " Hello, JDK11!\u3000\u3000";
        System.err.println("     original: [" + s + "]");
        System.err.println("         trim: [" + s.trim() + "]");
        System.err.println("        strip: [" + strip(s) + "]");
        System.err.println(" stripLeading: [" + s.stripLeading() + "]");
        System.err.println("stripTrailing: [" + s.stripTrailing() + "]");
        /*
        * ****OUTPUT****
        * original: [ Hello, JDK11!　　]
        * trim: [Hello, JDK11!　　]
        * strip: [Hello, JDK11!]
        * stripLeading: [Hello, JDK11!　　]
        * stripTrailing: [ Hello, JDK11!]
        * */
        // 第一个为英文空格，第二个未中文空格
        s = "  ";
        System.err.println(s.isEmpty());
        System.err.println(isBlank(s));
        /*
        * ****OUTPUT****
        * false
        * true
        * */
        s = "Java\nPython\nRuby";
        lines(s);
        /*
        * ****OUTPUT****
        * Java
        * Python
        * Ruby
        * */
        s = "abc";
        System.err.println(repeat(s, 3));
        /*
        * ****OUTPUT****
        * abcabcabc
        * */
    }

    /**
     * 和trim()相比，strip()可以去掉Unicode空格
     *
     * @param str
     * @return 
     * @author dongyang
     * @date 2021/7/12 11:54
     */
    private static String strip(String str) {
        return str.strip();
    }

    /**
     * 判断字符串是不是空白字符串
     *
     * @param str
     * @return
     * @author dongyang
     * @date 2021/7/12 14:12
     */
    private static boolean isBlank(String str) {
        return str.isBlank();
    }

    /**
     * 按行分割字符串
     *
     * @param str
     * @return 
     * @author dongyang
     * @date 2021/7/12 14:20
     */
    private static void lines(String str) {
        str.lines().forEach(System.err::println);
    }

    /**
     * 对指定字符串指定重复次数生成新的字符创
     *
     * @param str
     * @return
     * @author dongyang
     * @date 2021/7/12 14:23
     */
    private static String repeat(String str, int count) {
        return str.repeat(count);
    }
}
