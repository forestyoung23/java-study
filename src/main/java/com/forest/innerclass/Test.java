package com.forest.innerclass;

/**
 * @author Forest Dong
 * @date 2021年09月28日 08:40
 */
public class Test {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
}

interface Destination {

}
