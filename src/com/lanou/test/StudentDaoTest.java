package com.lanou.test;

import com.lanou.dao.StudentDao;
import com.lanou.dao.impl.StudentDaoImpl;
import com.lanou.domain.Student;
import org.junit.Test;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class StudentDaoTest {

    @Test
    public void save() {
        //创建一个dao层的对应
        StudentDao dao = new StudentDaoImpl();

        //创建要保存的对象
        Student student = new Student(
                "马祥光", "男", 24);

        System.out.println("保存前：" + student);

        student = dao.save(student);//保存对象

        System.out.println("保存后：" + student);

    }

    @Test
    public void login() {
        StudentDao dao = new StudentDaoImpl();
        boolean result = dao.login("马祥光4455", "123");
        System.out.println("登录结果：" + result);
    }


}
