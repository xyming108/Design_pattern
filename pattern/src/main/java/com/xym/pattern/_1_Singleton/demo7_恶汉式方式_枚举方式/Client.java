package com.xym.pattern._1_Singleton.demo7_恶汉式方式_枚举方式;

/**
 * @user: Hasee
 * @date: 2021/3/26 11:39
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建Singleton类的对象
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        //判断获取到的两个是否是同一个对象
        System.out.println(instance1 == instance2);
    }
}
