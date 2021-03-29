package com.xym.pattern._4_Prototype.demo1_克隆;

/**
 * @user: Hasee
 * @date: 2021/3/28 11:31
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        //开始调用Realizetype中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();
        System.out.println("原型对象和克隆出来的是否是同一个对象？\n" + (realizetype == clone));
    }
}
