package com.xym.pattern._2_Factory.demo4_抽象工厂模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 16:24
 * @author: 1931559710@qq.com
 * ClassName: AmericanDessertFactory
 * Description:
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
