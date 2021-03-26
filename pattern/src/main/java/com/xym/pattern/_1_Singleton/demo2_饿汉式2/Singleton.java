package com.xym.pattern._1_Singleton.demo2_饿汉式2;

/***
 * @user: Hasee
 * @date: 2021/3/26 14:54
 * @author: 1931559710@qq.com
 * ClassName: _1_Singleton
 * Description:
 *      饿汉式：静态代码块的方式
 */
public class Singleton {
    //私有构造方法
    private Singleton() {
    }

    //声明Singleton类型的变量
    private static Singleton instance;  //null

    //在静态代码块中赋值
    static {
        instance = new Singleton();
    }

    //对外提供获取该类对象的方法
    public static Singleton getInstance() {
        return instance;
    }

}
