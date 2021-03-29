package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:39
 * @author: 1931559710@qq.com
 * ClassName: Director
 * Description:指挥者类
 */
public class Director {

    //声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的方法
    public Bike construct() {
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }
}
