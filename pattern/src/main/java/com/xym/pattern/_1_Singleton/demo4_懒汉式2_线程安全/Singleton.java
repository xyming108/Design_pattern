package com.xym.pattern._1_Singleton.demo4_懒汉式2_线程安全;

/***
 * @user: Hasee
 * @date: 2021/3/26 15:10
 * @author: 1931559710@qq.com
 * ClassName: _1_Singleton
 * Description:
 *      懒汉式：
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的变量instance
    private static Singleton instance;  //只是声明一个类型的变量，没有进行赋值

    //对外提供访问方法
    //加synchronized锁 使其为线程安全方式，当一个线程进来之后其他线程不会进来
    public static synchronized Singleton getInstance() {
        //判断instance是否为null，如果为null，说明还没有创建Singleton类的对象
        //如果没有，创建一个并返回，如果有，直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
