package com.xym.pattern._4_Prototype.demo3_深克隆;

import java.io.Serializable;

/**
 * @user: Hasee
 * @date: 2021/3/28 17:25
 * @author: 1931559710@qq.com
 * ClassName: Student
 * Description:
 */
public class Student implements Serializable {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
