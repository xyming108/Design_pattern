package com.xym.pattern._2_FactoryMethod.demo3_工厂方法模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 13:51
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();

        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();

        System.out.println(coffee.getName());

    }
}
