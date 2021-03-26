package com.xym.principle.demo1_开闭原则;

/**
 * @user: Hasee
 * @date: 2021/3/24 21:08
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        //创建搜狗输入法对象
        SougouInput input = new SougouInput();
        //创建默认皮肤
//        DefaultSkin skin = new DefaultSkin();
        HeimaSkin heimaSkin = new HeimaSkin();
        //将皮肤设置到输入法中
        input.setSkin(heimaSkin);
        //显示皮肤
        input.display();
    }
}
