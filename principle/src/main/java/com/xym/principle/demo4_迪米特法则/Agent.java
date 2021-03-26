package com.xym.principle.demo4_迪米特法则;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:49
 * @author: 1931559710@qq.com
 * ClassName: Agent
 * Description:
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面了");
    }

    //和媒体公司洽谈的方法
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
