package com.forest.spi;

/**
 * @author dongyang
 * @date 2021年07月08日 17:03
 */
public class Bike implements Car {
    @Override
    public String run() {
        return "自行车";
    }
}
