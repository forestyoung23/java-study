package com.forest.designpatterns.adapter;

/**
 * @author dongyang
 * @date 2020年07月30日 08:50
 */
public class OutputAdapter extends Output220 implements IOutput {
    @Override
    public int output5() {
        return out220() / 44;
    }
}
