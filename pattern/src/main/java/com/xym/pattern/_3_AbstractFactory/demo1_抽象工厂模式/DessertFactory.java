package com.xym.pattern._3_AbstractFactory.demo1_抽象工厂模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 16:23
 * @author: 1931559710@qq.com
 * ClassName: DessertFactory
 * Description:
 */
public interface DessertFactory {
    //生产咖啡
    Coffee createCoffee();

    //生产甜品
    Dessert createDessert();
}
