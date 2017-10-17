package com.lanou.test;

import com.lanou.dao.StudentDao;
import com.lanou.dao.impl.StudentDaoImpl;
import com.lanou.domain.Student;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void find() {
        StudentDao dao = new StudentDaoImpl();
        String hql = "from Student where sname=:name and age=:age";
        Map<String, Object> params = new HashMap<>();
        params.put("name", "马祥光");//对应冒号后面的值
        params.put("age", 24);
        Student student = dao.find(hql, params);
        System.out.println(student);

    }

    @Test
    public void findAll() {
        StudentDao dao = new StudentDaoImpl();
        String hql = "from Student";

        List<Student> students = dao.findAll(hql, null);

        for (Student stu : students) {
            System.out.println(stu);
        }
    }

    @Test
    public void login() {
        StudentDao dao = new StudentDaoImpl();
        boolean result = dao.login("马祥光4455", "123");
        System.out.println("登录结果：" + result);
    }


}
