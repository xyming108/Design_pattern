package com.xym.principle.demo3_依赖倒转原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/25 9:16
 * @author: 1931559710@qq.com
 * ClassName: Computer
 * Description:
 */
public class Computer {
    private XijieHardDisk xijieHardDisk;
    private IntelCPU intelCPU;
    private KingstonMemory kingstonMemory;

    public XijieHardDisk getXijieHardDisk() {
        return xijieHardDisk;
    }

    public void setXijieHardDisk(XijieHardDisk xijieHardDisk) {
        this.xijieHardDisk = xijieHardDisk;
    }

    public IntelCPU getIntelCPU() {
        return intelCPU;
    }

    public void setIntelCPU(IntelCPU intelCPU) {
        this.intelCPU = intelCPU;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run() {
        System.out.println("运行计算机");
        String s = xijieHardDisk.get();
        System.out.println("从硬盘上获取的是：" + s);
        intelCPU.run();
        kingstonMemory.save();
    }
}
