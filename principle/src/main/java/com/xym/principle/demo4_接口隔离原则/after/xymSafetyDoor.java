package com.xym.principle.demo4_接口隔离原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:21
 * @author: 1931559710@qq.com
 * ClassName: xymSafetyDoor
 * Description:
 */

public class xymSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("防火");
    }
}
