package com.lanou.dao;

import com.lanou.domain.Student;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public interface StudentDao extends BaseDao<Student> {
    /**
     * 学生登录查询
     *
     * @param sname 用户名
     * @param psw   密码
     * @return 成功返回true 否则返回false
     **/
    boolean login(String sname, String psw);
}
