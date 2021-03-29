package com.xym.pattern._6_Proxy.demo3_cglib动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @user: Hasee
 * @date: 2021/3/29 13:31
 * @author: 1931559710@qq.com
 * ClassName: ProxyFactory
 * Description:代理对象工厂，用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    //声明火车站对象
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似jdk代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象，指定父类
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyOjkect = (TrainStation) enhancer.create();

        return proxyOjkect;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费用");
        Object invoke = method.invoke(station, objects);
        return invoke;
    }
}
