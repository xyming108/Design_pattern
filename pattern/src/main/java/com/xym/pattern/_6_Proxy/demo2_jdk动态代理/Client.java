package com.xym.pattern._6_Proxy.demo2_jdk动态代理;

/**
 * @user: Hasee
 * @date: 2021/3/29 11:01
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory proxyFactory = new ProxyFactory();
        //使用工厂对象方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        //开始调用卖电脑的方法
        proxyObject.sell();

        System.out.println("代理类名称："+proxyFactory.getClass());

    }
}
