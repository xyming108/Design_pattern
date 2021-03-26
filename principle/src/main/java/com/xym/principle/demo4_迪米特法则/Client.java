package com.xym.principle.demo4_迪米特法则;

/**
 * @user: Hasee
 * @date: 2021/3/26 9:52
 * @author: 1931559710@qq.com
 * ClassName: Client
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("周深");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("小白菜");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("长风传媒");
        agent.setCompany(company);

        agent.meeting();    //和粉丝见面
        agent.business();   //和媒体公司洽谈业务
    }
}
