package com.forest.java21;

/**
 * 虚拟线程测试
 *
 * @author Forest Dong
 * @date 2024年03月13日 21:20
 */
public class VirtualThreadTest {

    public static class Task implements Runnable {

        /**
         * Runs this operation.
         */
        @Override
        public void run() {
            System.err.println("执行线程：" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = Thread.startVirtualThread(task);
    }
}
