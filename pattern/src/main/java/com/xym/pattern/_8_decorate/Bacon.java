package com.xym.pattern._8_decorate;

/**
 * @user: Hasee
 * @date: 2021/3/29 22:42
 * @author: 1931559710@qq.com
 * ClassName: Bacon
 * Description:培根类（具体的装饰者角色）
 */
public class Bacon extends garnish {

    public Bacon(FastFood fastFood) {
        super(2, "培根", fastFood);
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
