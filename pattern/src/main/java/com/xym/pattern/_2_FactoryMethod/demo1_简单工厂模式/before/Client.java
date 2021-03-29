package com.xym.pattern._2_FactoryMethod.demo1_简单工厂模式.before;


/**
 * @user: Hasee
 * @date: 2021/3/27 9:17
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店类
        CoffeeStore store = new CoffeeStore();

        //点咖啡
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());

    }
}
