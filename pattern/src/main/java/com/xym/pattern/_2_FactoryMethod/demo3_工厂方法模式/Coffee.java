package com.xym.pattern._2_FactoryMethod.demo3_工厂方法模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 9:06
 * @author: 1931559710@qq.com
 * ClassName: Coffee
 * Description:咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addsugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
