package com.forest.designpatterns.prototype;


/**
 * @author Forest
 * @date 2020年07月28日 01:05
 */
public class Tom implements Cloneable {
    public int age;
    public String sizw;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Tom{" +
                "age=" + age +
                ", sizw='" + sizw + '\'' +
                '}';
    }
}
