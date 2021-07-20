package com.forest.reflect;

/**
 * @author dongyang
 * @date 2021年07月20日 17:16
 */
public class Cat implements Animal {

    @Override
    public void run() {
        System.err.println("Cat is Running");
    }
}
