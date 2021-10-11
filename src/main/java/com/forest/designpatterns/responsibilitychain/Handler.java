package com.forest.designpatterns.responsibilitychain;

/**
 * 抽象处理类
 *
 * @author Forest Dong
 * @date 2021年10月11日 10:16
 */
public abstract class Handler {
    private Handler next;

    /**
     * 每个处理者都必须对请求做出处理
     * @param request
     * @return
     */
    public final Response handle(Request request) {
        Response response;
        // 判断是否是自己的处理级别
        if (request.getLevel().equals(this.getLevel())) {
            response = this.execute(request);
        } else {
            // 不属于自己的处理级别
            // 判断是否有下一个处理者
            if (null != this.next) {
                response = this.next.handle(request);
            } else {
                response = new Response();
                response.setMessage("没有适当的处理器，业务自行处理");
            }
        }
        return response;
    }

    /**
     * 每个处理者都必须实现处理任务
     *
     * @param request
     * @return
     * @author Forest Dong
     * @date 2021/10/11 上午10:38
     */
    protected abstract Response execute(Request request);

    /**
     * 每个处理者都有一个处理级别
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/11 上午10:38
     */
    protected abstract Integer getLevel();

    /**
     * 设置下一个处理者是谁
     *
     * @param handler
     * @return
     * @author Forest Dong
     * @date 2021/10/11 上午10:39
     */
    protected void setNext(Handler handler) {
        this.next = handler;
    }
}
