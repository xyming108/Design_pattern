package com.xym.principle.demo4_迪米特法则;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:46
 * @author: 1931559710@qq.com
 * ClassName: Star
 * Description:
 */
public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
