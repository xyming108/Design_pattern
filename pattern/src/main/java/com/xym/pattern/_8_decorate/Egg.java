package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:34
 * @author: 1931559710@qq.com
 * ClassName: Egg
 * Description:鸡蛋类（具体的装饰者角色）
 */
public class Egg extends garnish {

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
