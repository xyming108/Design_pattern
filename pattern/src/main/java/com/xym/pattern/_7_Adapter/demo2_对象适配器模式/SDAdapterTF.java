package com.xym.pattern._7_Adapter.demo2_对象适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 16:44
 * @author: 1931559710@qq.com
 * ClassName: SDAdapterTF
 * Description:
 */
public class SDAdapterTF implements SDCard {
    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
