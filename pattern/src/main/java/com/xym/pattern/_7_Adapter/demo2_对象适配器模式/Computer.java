package com.xym.pattern._7_Adapter.demo2_对象适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 16:13
 * @author: 1931559710@qq.com
 * ClassName: Computer
 * Description:计算机类
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
