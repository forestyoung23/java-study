package com.forest.gc;

/**
 * @author Forest
 * @date 2020年11月08日 15:48
 */
class Test {
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
        // super.finalize();
    }
}

public class FinalizeDemo {

    private Test test;

    public static void main(String[] args) {
        int i = 0;
        while(true) {
            Test test = new Test(true);
            test.checkIn();
            new Test(true);
            System.err.println(i++);
        }
    }
}
