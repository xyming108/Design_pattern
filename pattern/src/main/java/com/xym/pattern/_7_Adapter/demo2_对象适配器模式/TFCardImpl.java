package com.xym.pattern._7_Adapter.demo2_对象适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 15:44
 * @author: 1931559710@qq.com
 * ClassName: TFCardImpl
 * Description:适配者类
 */

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg：" + msg);
    }
}
