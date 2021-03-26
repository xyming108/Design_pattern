package com.xym.pattern._1_Singleton.demo7_恶汉式方式_枚举方式;

/***
 * @user: Hasee
 * @date: 2021/3/26 17:04
 * @author: 1931559710@qq.com
 * ClassName: Singleton
 * Description:枚举实现方式
 *      极力推荐的单例实现模式，
 *          因为枚举类型是线程安全的，
 *          只会装载一次，
 *          是所有单例模式中唯一一种不会被破坏的单例实现模式
 */
public enum Singleton {
    INSTANCE;
}
