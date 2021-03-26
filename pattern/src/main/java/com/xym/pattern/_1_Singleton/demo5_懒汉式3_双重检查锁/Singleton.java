package com.xym.pattern._1_Singleton.demo5_懒汉式3_双重检查锁;

/***
 * @user: Hasee
 * @date: 2021/3/26 15:58
 * @author: 1931559710@qq.com
 * ClassName: _1_Singleton
 * Description:
 *      双重检查锁方式
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的变量
    //volatile关键字可以在多线程的情况下解决空指针异常问题
    private static volatile Singleton instance;

    //对外提供公共的访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
