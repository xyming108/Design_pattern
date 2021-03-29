package com.xym.pattern._2_FactoryMethod.demo3_工厂方法模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 9:12
 * @author: 1931559710@qq.com
 * ClassName: CoffeeStore
 * Description:
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();

        //加配料
        coffee.addMilk();
        coffee.addsugar();

        return coffee;
    }

}
