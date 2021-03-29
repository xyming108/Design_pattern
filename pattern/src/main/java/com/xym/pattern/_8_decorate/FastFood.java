package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:23
 * @author: 1931559710@qq.com
 * ClassName: FastFood
 * Description:快餐类（抽象构建角色）
 */
public abstract class FastFood {
    private float price;    //价格
    private String desc;    //描述

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}
