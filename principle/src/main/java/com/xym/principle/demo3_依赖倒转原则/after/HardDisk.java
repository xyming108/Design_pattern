package com.xym.principle.demo3_依赖倒转原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/25 13:39
 * @author: 1931559710@qq.com
 * ClassName: HardDisk
 * Description:硬盘接口
 */
public interface HardDisk {

    //存储数据的方法
    public void save(String data);

    //获取数据
    public String get();
}
