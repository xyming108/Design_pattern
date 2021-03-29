package com.xym.pattern._4_Prototype.demo1_克隆;

/**
 * @user: Hasee
 * @date: 2021/3/28 11:12
 * @author: 1931559710@qq.com
 * ClassName: Realizetype
 * Description:
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型对象创建完成！");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");

        return (Realizetype) super.clone();
    }
}
