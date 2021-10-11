package com.forest.designpatterns.responsibilitychain;

/**
 * 请求
 *
 * @author Forest Dong
 * @date 2021年10月11日 10:17
 */
public class Request {
    private Integer level;

    public Request(Integer level) {
        this.level = level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }
}
