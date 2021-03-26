package com.xym.pattern._1_Singleton.demo5_懒汉式3_双重检查锁;

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
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //判断获取到的两个是否是同一个对象
        System.out.println(instance1 == instance2);
    }
}
