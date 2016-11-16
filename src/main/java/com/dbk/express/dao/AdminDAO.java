package com.dbk.express.dao;

import com.dbk.express.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by lenovo on 2016/11/10.
 */
public class AdminDAO<T> {

    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //插入数据
    public void create(T object){
        //this.hibernateTemplate.save(object);

       /* Session session = sessionFactory.getCurrentSession();
        session.save(object);*/

       this.hibernateTemplate.getSessionFactory().getCurrentSession().save(object);
    }

    //登陆
    public boolean login(String username,String passwd)
    {
        boolean isSuccess = this.hibernateTemplate.find("from DbkAdminEntity as a where a.adminId=? and a.adminPasswd=?",username,passwd).size()>0;
        return isSuccess;
    }

    public String getSchoolNameByAdminID(String id)
    {
        String name = (String)this.hibernateTemplate.find("select school.schoolName from DbkAdminEntity admin,DbkSchoolEntity school where admin.adminSchool = school.schoolId and admin.adminId=?",id).get(0);
        return name;
    }
}
