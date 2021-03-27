package com.xym.pattern._2_Factory.demo4_抽象工厂模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 16:28
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //意大利风味甜品工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();

        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();
    }
}
