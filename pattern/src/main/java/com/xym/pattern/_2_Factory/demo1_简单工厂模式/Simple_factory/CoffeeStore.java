package com.xym.pattern._2_Factory.demo1_简单工厂模式.Simple_factory;

/**
 * @user: Hasee
 * @date: 2021/3/27 9:12
 * @author: 1931559710@qq.com
 * ClassName: CoffeeStore
 * Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }

}
