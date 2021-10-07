package com.forest.designpatterns.builder;

import java.util.List;

/**
 * @author Forest Dong
 * @date 2021年09月30日 16:00
 */
public interface Builder {
    void setOrder(List<String> order);
    CarModel build();
}
