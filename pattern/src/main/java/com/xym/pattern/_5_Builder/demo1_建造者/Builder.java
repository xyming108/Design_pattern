package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:16
 * @author: 1931559710@qq.com
 * ClassName: Builder
 * Description:
 */
public abstract class Builder {
    //声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    //构建自行车的方法
    public abstract Bike createBike();
}
