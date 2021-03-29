package com.xym.pattern._6_Proxy.demo2_jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @user: Hasee
 * @date: 2021/3/29 10:45
 * @author: 1931559710@qq.com
 * ClassName: ProxyFactory
 * Description:获取代理对象的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {
    //声明目标对象
    private TrainStation station = new TrainStation();

    //获取代理对象的方法
    public SellTickets getProxyObject() {
        //返回代理对象
        /***
         * ClassLoader loader：类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces：代理类实现的接口的字节码对象
         * InvocationHandler：代理对象的调用处理程序
         * @return
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * @param proxy     代理对象，和proxyObject是同一个对象，在invoke方法中基本不用
                     * @param method    对接口中的方法进行封装的method对象
                     * @param args      调用方法的实际参数
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用（jdk动态代理）");
                        //执行目标对象的方法
                        Object invoke = method.invoke(station, args);
                        return invoke;
                    }
                }
        );
        return proxyObject;
    }
}
