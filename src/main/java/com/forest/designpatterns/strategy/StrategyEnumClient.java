package com.forest.designpatterns.strategy;

/**
 * @author Forest Dong
 * @date 2021年10月13日 11:29
 */
public class StrategyEnumClient {
    public static void main(String[] args) {
        int a = 1, b = 1;
        String symbol = "-";
        System.err.println("运行结果为：" + a + symbol + b + "=" + StrategyEnum.SUB.exec(a, b));
    }
}
