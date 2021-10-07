package com.forest.designpatterns.builder;

import java.util.List;

/**
 * @author Forest Dong
 * @date 2021年09月30日 15:58
 */
public class Car1Builder implements Builder {
    private Car1Model carModel = new Car1Model();

    @Override
    public void setOrder(List<String> order) {
        this.carModel.setOrder(order);
    }

    @Override
    public Car1Model build() {
        return carModel;
    }
}
