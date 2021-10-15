package com.forest.designpatterns.iterator;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月15日 14:03
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.err.println(iterator.next());
        }
    }
}
