package com.forest.designpatterns.templatemethod;

/**
 * @author Forest Dong
 * @date 2021年09月29日 19:05
 */
public class Client {
    public static void main(String[] args) {
        CarModel carModel = new Car1Model();
        carModel.run();
    }
}
