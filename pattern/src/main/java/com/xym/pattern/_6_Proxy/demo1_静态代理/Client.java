package com.xym.pattern._6_Proxy.demo1_静态代理;


/**
 * @user: Hasee
 * @date: 2021/3/29 10:36
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();

        proxyPoint.sell();
    }
}
