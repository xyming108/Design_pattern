package com.xym.pattern._1_Singleton.demo1_饿汉式1;

/***
 * @user: Hasee
 * @date: 2021/3/26 11:28
 * @author: 1931559710@qq.com
 * ClassName: _1_Singleton
 * Description:
 *      饿汉式：静态成员变量的方式
 */
public class Singleton {

    //1、私有空参构造，外界访问不到
    private Singleton() {
    }

    //2、在本类中创建本类对象
    private static Singleton instance = new Singleton();

    //3、提供一个公共的访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
