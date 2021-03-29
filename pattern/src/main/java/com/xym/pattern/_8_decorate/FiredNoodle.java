package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:29
 * @author: 1931559710@qq.com
 * ClassName: FiredNoodle
 * Description:
 */
public class FiredNoodle extends FastFood {

    public FiredNoodle() {
        super(20, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
