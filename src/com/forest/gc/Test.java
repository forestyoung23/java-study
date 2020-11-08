package com.forest.gc;

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
}
