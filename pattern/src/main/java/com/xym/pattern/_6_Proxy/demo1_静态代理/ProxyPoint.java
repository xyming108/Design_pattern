package com.xym.pattern._6_Proxy.demo1_静态代理;

/**
 * @user: Hasee
 * @date: 2021/3/29 10:34
 * @author: 1931559710@qq.com
 * ClassName: ProxyPoint
 * Description:代售点类
 */
public class ProxyPoint implements SellTickets {
    //声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        trainStation.sell();
    }
}
