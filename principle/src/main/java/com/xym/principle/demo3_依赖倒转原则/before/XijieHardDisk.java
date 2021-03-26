package com.xym.principle.demo3_依赖倒转原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/25 9:17
 * @author: 1931559710@qq.com
 * ClassName: XijieHardDisk
 * Description: 希捷硬盘
 */
public class XijieHardDisk {
    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据");
    }

    //获取数据的方法
    public String get() {
        System.out.println("使用希捷硬盘读取数据");
        return "数据";
    }
}
