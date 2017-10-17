package com.lanou.dao.impl;

import com.lanou.dao.StudentDao;
import com.lanou.domain.Student;
import com.lanou.util.HibernateUtil;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class StudentDaoImpl extends BaseDaoImpl<Student>
        implements StudentDao {

    /**
     * 登录
     **/
    @Override
    public boolean login(String sname, String psw) {
        String hql = "from Student where sname=?";//查询语句

        Query query = HibernateUtil.getSession().createQuery(hql);

        query.setString(0, sname);/*设置查询语句的参数*/

        List<Student> students = query.list();

        //根据查询结果集进行返回 如果结果集大于0 则返回true，否则返回false
        return students.size() > 0;
    }
}
