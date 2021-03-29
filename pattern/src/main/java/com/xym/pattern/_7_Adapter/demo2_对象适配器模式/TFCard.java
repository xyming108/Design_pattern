package com.xym.pattern._7_Adapter.demo2_对象适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 15:29
 * @author: 1931559710@qq.com
 * ClassName: TFCard
 * Description:适配者
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();

    //往TF卡中写数据
    void writeTF(String msg);
}
