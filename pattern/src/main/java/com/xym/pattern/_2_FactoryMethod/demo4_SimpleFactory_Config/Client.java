package com.xym.pattern._2_FactoryMethod.demo4_SimpleFactory_Config;

/**
 * @user: Hasee
 * @date: 2021/3/27 20:27
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee);
        System.out.println(coffee.getName());
        System.out.println("============================");
        Coffee coffee1 = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee1);
        System.out.println(coffee1.getName());
    }
}
