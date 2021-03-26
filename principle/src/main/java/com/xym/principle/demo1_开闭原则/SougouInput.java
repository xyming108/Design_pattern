package com.xym.principle.demo1_开闭原则;

/**
 * @user: Hasee
 * @date: 2021/3/24 16:17
 * @author: 1931559710@qq.com
 * ClassName: SougouInput
 * Description:
 */
public class SougouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
