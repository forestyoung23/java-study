package com.forest.designpatterns.responsibilitychain;

/**
 * 处理结果
 *
 * @author Forest Dong
 * @date 2021年10月11日 10:16
 */
public class Response {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                '}';
    }
}
