package com.xym.pattern._5_Builder.demo1_建造者;

/**
 * @user: Hasee
 * @date: 2021/3/28 21:15
 * @author: 1931559710@qq.com
 * ClassName: Bike
 * Description:
 */
public class Bike {
    private String frame;   //车架
    private String seat;    //车座

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
