package com.xym.pattern._2_Factory.demo2_静态工厂模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 9:12
 * @author: 1931559710@qq.com
 * ClassName: CoffeeStore
 * Description:
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        /*StaticCoffeeFactory factory = new StaticCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);*/

        Coffee coffee = StaticCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }

}
