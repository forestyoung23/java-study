package com.forest.spi;

/**
 * @author dongyang
 * @date 2021年07月08日 17:01
 */
public class Bus implements Car {
    @Override
    public String run() {
        return "公交车";
    }
}
