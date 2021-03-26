package com.xym.pattern._1_Singleton.demo6_懒汉式4_双重检查锁_静态内部类方式;

/***
 * @user: Hasee
 * @date: 2021/3/26 16:37
 * @author: 1931559710@qq.com
 * ClassName: _1_Singleton
 * Description:
 *      静态内部类方式
 */

public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象，保证只实例化一次
        //在没有加任何锁的情况下，保证了多线程情况下的安全，并且没有任何性能影响和空间的浪费
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
