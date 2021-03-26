package com.xym.principle.demo2_里氏代换原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/24 23:14
 * @author: 1931559710@qq.com
 * ClassName: Square
 * Description:正方形
 */
public class Square implements Quadrilateral {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
