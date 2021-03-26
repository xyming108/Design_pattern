package com.xym.principle.demo3_依赖倒转原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/25 9:19
 * @author: 1931559710@qq.com
 * ClassName: IntelCPU
 * Description: 因特尔cpu
 */
public class IntelCPU implements Cpu {
    public void run() {
        System.out.println("使用intel处理器");
    }
}
