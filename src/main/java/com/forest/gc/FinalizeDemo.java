package com.forest.gc;

/**
 * @author Forest
 * @date 2020年11月08日 15:48
 */
public class FinalizeDemo {

    public static void main(String[] args) {
        Test test = new Test(true);
        test.checkIn();
        new Test(true);
        System.gc();
    }

}
