package com.xym.principle.demo2_里氏代换原则.after;

/**
 * @user: Hasee
 * @date: 2021/3/24 23:17
 * @author: 1931559710@qq.com
 * ClassName: RectangleDemo
 * Description:
 */
public class RectangleDemo {

    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        //调用方法进行扩宽操作
        resize(r);
        printLengthAndWidth(r);
    }

    //扩宽的类
    public static void resize(Rectangle rectangle) {
        //判断宽，如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}
