package com.forest.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ServiceLoader<Car> load = ServiceLoader.load(Car.class);
        Iterator<Car> iterator = load.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.err.println(car.run());
        }
    }
}
