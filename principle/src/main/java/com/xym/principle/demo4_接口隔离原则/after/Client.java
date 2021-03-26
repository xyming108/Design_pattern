package com.xym.principle.demo4_接口隔离原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:20
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建黑马安全门对象
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireProof();
        door.waterProof();
        System.out.println("***************************");
        xymSafetyDoor xym = new xymSafetyDoor();
        xym.antiTheft();
        xym.fireProof();
    }
}
