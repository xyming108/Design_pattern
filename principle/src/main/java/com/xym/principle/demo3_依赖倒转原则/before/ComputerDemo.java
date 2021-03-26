package com.xym.principle.demo3_依赖倒转原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/25 9:30
 * @author: 1931559710@qq.com
 * ClassName: ComputerDemo
 * Description:
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XijieHardDisk xijieHardDisk = new XijieHardDisk();
        IntelCPU intelCPU = new IntelCPU();
        KingstonMemory kingstonMemory = new KingstonMemory();

        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setIntelCPU(intelCPU);
        computer.setXijieHardDisk(xijieHardDisk);
        computer.setKingstonMemory(kingstonMemory);

        //运行计算机
        computer.run();
    }
}
