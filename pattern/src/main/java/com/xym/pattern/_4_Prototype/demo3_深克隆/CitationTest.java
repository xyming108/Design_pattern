package com.xym.pattern._4_Prototype.demo3_深克隆;

import java.io.*;

/**
 * @user: Hasee
 * @date: 2021/3/28 17:26
 * @author: 1931559710@qq.com
 * ClassName: CitationTest
 * Description:
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {

        Citation c1 = new Citation();
        Student stu = new Student("张三", "西安");
        c1.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./a.txt"));
        //写对象
        oos.writeObject(c1);
        //释放资源
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        //读取对象
        Citation cc1 = (Citation) ois.readObject();
        //释放资源
        ois.close();
        Student stu1 = cc1.getStu();
        stu1.setName("李四");

        c1.show();
        cc1.show();
    }
}
