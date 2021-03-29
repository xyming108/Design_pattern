package com.xym.pattern._7_Adapter.demo1_类适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 16:44
 * @author: 1931559710@qq.com
 * ClassName: SDAdapterTF
 * Description:
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
