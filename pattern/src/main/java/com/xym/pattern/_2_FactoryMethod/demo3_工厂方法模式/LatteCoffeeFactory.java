package com.xym.pattern._2_FactoryMethod.demo3_工厂方法模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 13:03
 * @author: 1931559710@qq.com
 * ClassName: LatteCoffeeFactory
 * Description:
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
