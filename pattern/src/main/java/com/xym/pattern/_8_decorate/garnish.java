package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:30
 * @author: 1931559710@qq.com
 * ClassName: garnish
 * Description:装饰者类（抽象装饰者角色）
 */
public abstract class garnish extends FastFood {

    //声明快餐类的变量
    private FastFood fastFood;

    public garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
