package com.forest.concurrency;

/**
 * 多线程测试
 * 
 * @author Forest
 * @date 2020年05月09日 02:48
 */
public class ConcurrencyTest {
    private static final long count = 1000000000 ;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b++;
        }
        System.err.println("串行time=" + (System.currentTimeMillis() - start) + ",a=" + a + ",b=" + b);
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a++;
//                    System.err.println("a执行");
                }
//                System.err.println("a执行完成");
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b++;
//            System.err.println("b执行");
        }
        // 等待子线程执行结束
        thread.join();
        System.err.println("并发time=" + (System.currentTimeMillis() - start) + ",b=" + b);
    }
}
