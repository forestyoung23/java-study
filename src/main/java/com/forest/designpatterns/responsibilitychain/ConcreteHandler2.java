package com.forest.designpatterns.responsibilitychain;

/**
 * 具体处理者
 *
 * @author Forest Dong
 * @date 2021年10月11日 10:31
 */
public class ConcreteHandler2 extends Handler {
    /**
     * 定义自己的处理逻辑
     *
     * @param request
     * @return
     * @author Forest Dong
     * @date 2021/10/11 上午10:39
     */
    @Override
    protected Response execute(Request request) {
        Response response = new Response();
        response.setMessage("ConcreteHandler2处理成功");
        return response;
    }

    /**
     * 设置自己的处理级别
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/11 上午10:40
     */
    @Override
    protected Integer getLevel() {
        return 2;
    }
}
