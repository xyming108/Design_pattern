package com.xym.pattern._2_FactoryMethod.demo3_工厂方法模式;

/**
 * @user: Hasee
 * @date: 2021/3/27 12:22
 * @author: 1931559710@qq.com
 * ClassName: CoffeeFactory
 * Description: 抽象工厂
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡对象的方法
     *
     * @return
     */
    Coffee createCoffee();
}
