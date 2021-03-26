package com.xym.principle.demo4_接口隔离原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:12
 * @author: 1931559710@qq.com
 * ClassName: HeimaSafetyDoor
 * Description:
 */
public class HeimaSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
