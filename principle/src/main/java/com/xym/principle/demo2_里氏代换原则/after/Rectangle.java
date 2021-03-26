package com.xym.principle.demo2_里氏代换原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/24 23:15
 * @author: 1931559710@qq.com
 * ClassName: Rectangle
 * Description:长方形类
 */
public class Rectangle implements Quadrilateral {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
