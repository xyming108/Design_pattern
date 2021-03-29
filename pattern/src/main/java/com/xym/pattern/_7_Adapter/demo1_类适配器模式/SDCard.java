package com.xym.pattern._7_Adapter.demo1_类适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 16:05
 * @author: 1931559710@qq.com
 * ClassName: SDCard
 * Description:目标接口
 */
public interface SDCard {
    //从SD卡中读取数据
    String readSD();

    //往SD卡中写数据
    void writeSD(String msg);
}
