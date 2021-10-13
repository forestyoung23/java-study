package com.forest.designpatterns.strategy;

/**
 * 策略枚举
 *
 * @author Forest Dong
 * @date 2021年10月13日 11:23
 */
public enum StrategyEnum {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };
    private String value;
    private StrategyEnum(String value) {
        this.value = value;
    }

    /**
     * 获取枚举成员的值
     * @return
     */
    public String getValue() {
        return this.value;
    }

    /**
     * 声明抽象函数
     *
     * @param a
     * @param b
     * @return
     */
    public abstract int exec(int a, int b);
}
