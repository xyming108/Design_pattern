package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:26
 * @author: 1931559710@qq.com
 * ClassName: FiredRice
 * Description:
 */
public class FiredRice extends FastFood {

    public FiredRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
