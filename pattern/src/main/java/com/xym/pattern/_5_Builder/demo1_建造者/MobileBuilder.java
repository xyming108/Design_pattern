package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:27
 * @author: 1931559710@qq.com
 * ClassName: MobileBuilder
 * Description: 具体的构建者
 */
public class MobileBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
