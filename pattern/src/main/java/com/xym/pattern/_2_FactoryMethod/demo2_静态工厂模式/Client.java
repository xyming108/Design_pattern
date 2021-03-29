package com.xym.pattern._2_FactoryMethod.demo2_静态工厂模式;

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
        Coffee coffee = store.orderCoffee("american");

        System.out.println(coffee.getName());

    }
}
