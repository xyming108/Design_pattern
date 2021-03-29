package com.xym.pattern._6_Proxy.demo3_cglib动态代理;

/**
 * @user: Hasee
 * @date: 2021/3/29 13:36
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        //调用代理对象中的sell方法卖票
        proxyObject.sell();
    }
}
