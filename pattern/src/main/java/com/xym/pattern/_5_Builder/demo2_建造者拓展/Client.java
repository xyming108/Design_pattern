package com.xym.pattern._5_Builder.demo2_建造者拓展;

/**
 * @user: Hasee
 * @date: 2021/3/29 8:19
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainboard("华硕主板")
                .builder();
        System.out.println(phone);
    }
}
