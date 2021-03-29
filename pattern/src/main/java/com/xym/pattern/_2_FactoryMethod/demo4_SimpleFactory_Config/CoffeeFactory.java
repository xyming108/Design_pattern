package com.xym.pattern._2_FactoryMethod.demo4_SimpleFactory_Config;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @user: Hasee
 * @date: 2021/3/27 18:58
 * @author: 1931559710@qq.com
 * ClassName: CoffeeFactory
 * Description:
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    //加载配置文件，只需要加载一次
    static {
        //创建Properties对象
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            //调用load方法加载配置文件
            p.load(is);
            //从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            //key是配置文件=号前面的内容
            for (Object key : keys) {
                //className是配置文件=号后面的内容
                String className = p.getProperty((String) key);
                //通过反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将名称和对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据名称获取对象
     *
     * @param name
     * @return
     */
    public static Coffee createCoffee(String name) {

        return map.get(name);
    }
}
