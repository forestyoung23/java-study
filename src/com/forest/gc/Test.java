package com.forest.gc;

import java.util.Arrays;
import java.util.List;

/**
 * @author Forest
 * @date 2020年11月08日 15:52
 */
public class Test {
    boolean checkedOut = false;

    public Test(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() {
        if (checkedOut) {
            System.err.println("gc错误");
        }
//             super.finalize();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.add(6);
        System.err.println(list);
    }
}
