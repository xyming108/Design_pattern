package com.xym.principle.demo3_依赖倒转原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/25 13:45
 * @author: 1931559710@qq.com
 * ClassName: ComputerDemo
 * Description:
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建计算机的组件对象
        HardDisk hardDisk = new XijieHardDisk();
        Cpu cpu = new IntelCPU();
        Memory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();

        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        //运行计算机
        c.run();
    }
}
