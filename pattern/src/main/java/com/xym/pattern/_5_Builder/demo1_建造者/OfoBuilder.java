package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:38
 * @author: 1931559710@qq.com
 * ClassName: OfoBuilder
 * Description:Ofo单车构建者
 */
public class OfoBuilder extends Builder {

    @Override
    public void builderFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
