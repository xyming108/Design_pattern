package com.xym.principle.demo2_里氏代换原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/24 21:39
 * @author: 1931559710@qq.com
 * ClassName: Square 正方形类
 * Description:
 */
public class Square extends Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
