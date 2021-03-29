package com.xym.pattern._3_AbstractFactory.demo1_抽象工厂模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 16:24
 * @author: 1931559710@qq.com
 * ClassName: AmericanDessertFactory
 * Description:
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
