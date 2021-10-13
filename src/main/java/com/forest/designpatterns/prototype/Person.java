package com.forest.designpatterns.prototype;


/**
 * 原型模式
 *
 * @author Forest
 * @date 2020年07月28日 00:43
 */
public class Person implements Cloneable {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tom=" + tom +
                '}';
    }

    public String name;
    public Integer age;
    public Tom tom;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.tom = (Tom) this.tom.clone();
        return clone;
    }
}
