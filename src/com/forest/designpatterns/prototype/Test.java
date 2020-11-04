package com.forest.designpatterns.prototype;

/**
 * @author Forest
 * @date 2020年07月28日 00:44
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("哈哈", 234);
        person.tom = new Tom();
        Person person2 = (Person) person.clone();
        System.err.println(person.toString() + person.tom.hashCode());
        System.err.println(person2.toString() + person2.tom.hashCode());
    }
}
