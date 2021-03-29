package com.xym.pattern._6_Proxy.demo2_jdk动态代理;


/**
 * @user: Hasee
 * @date: 2021/3/29 10:33
 * @author: 1931559710@qq.com
 * ClassName: TrainStation
 * Description:火车站类
 */
public class TrainStation implements SellTickets {
    public void sell() {
        System.out.println("火车站卖票");
    }
}
