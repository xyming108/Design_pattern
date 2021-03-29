package com.xym.pattern._4_Prototype.demo2_浅克隆;

/**
 * @user: Hasee
 * @date: 2021/3/28 17:25
 * @author: 1931559710@qq.com
 * ClassName: Citation
 * Description:
 */
public class Citation implements Cloneable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}