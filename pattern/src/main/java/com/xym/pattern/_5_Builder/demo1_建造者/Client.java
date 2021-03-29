package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:47
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());

        //让指挥者组装自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
