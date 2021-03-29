package com.xym.pattern._7_Adapter.demo1_类适配器模式;

/**
 * @user: Hasee
 * @date: 2021/3/29 16:14
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();

        //读取SD卡中的数据
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);

        System.out.println("*******************************");

        //使用该电脑读取TF卡中的数据
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
