package com.xym.principle.demo3_依赖倒转原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/25 13:44
 * @author: 1931559710@qq.com
 * ClassName: Computer
 * Description:
 */
public class Computer {
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    //运行计算机
    public void run() {
        System.out.println("运行计算机");
        String s = hardDisk.get();
        System.out.println("从硬盘上获取的是：" + s);
        cpu.run();
        memory.save();
    }
}
