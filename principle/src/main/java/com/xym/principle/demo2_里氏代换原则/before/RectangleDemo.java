package com.xym.principle.demo2_里氏代换原则.before;

/**
 * @user: Hasee
 * @date: 2021/3/24 21:44
 * @author: 1931559710@qq.com
 * ClassName: RectangleDemo
 * Description:
 */
public class RectangleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle r = new Rectangle();
        //设置长和宽
        r.setLength(20);
        r.setWidth(10);
        //调用resize方法进行扩宽
        resize(r);
        printLengthAndWidth(r);
        System.out.println("------------------------------------");
        //创建正方形对象
        Square s = new Square();
        //设置长和宽
        s.setLength(10);
        //调用resize方法进行扩宽
        resize(s);
        printLengthAndWidth(s);
    }

    //扩宽的方法
    public static void resize(Rectangle rectangle) {
        //判断宽，如果比长小，进行扩宽的操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    //打印长和宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
