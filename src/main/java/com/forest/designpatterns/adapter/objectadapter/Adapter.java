package com.forest.designpatterns.adapter.objectadapter;

import com.forest.designpatterns.adapter.Target;

/**
 * 对象适配器
 * Target所需接口由IAdaptee1、IAdaptee2两个接口提供
 * 如：
 * 外部用户信息接入，外部的用户信息与系统内部可能不一致
 * 在系统内部就只有一个UserInfo接口，而外部可能拆分成了多个接口，如用户基本信息接口、
 * 用户家庭信息接口、用户工作信息接口。
 * 这时，我们可以通过在适配器中关联其三个接口实现适配
 *
 * @author Forest Dong
 * @date 2021年10月15日 08:56
 */
public class Adapter implements Target {
    private IAdaptee1 iAdaptee1;
    private IAdaptee2 iAdaptee2;
    public Adapter(IAdaptee1 iAdaptee1, IAdaptee2 iAdaptee2) {
        this.iAdaptee1 = iAdaptee1;
        this.iAdaptee2 = iAdaptee2;
    }
    @Override
    public void request1() {
        iAdaptee1.request();
    }

    @Override
    public void request2() {
        iAdaptee2.request();
    }
}
