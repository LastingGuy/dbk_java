package com.dbk.express.dao;

import com.dbk.express.orm.DbkSchoolEntity;
import com.sun.javafx.runtime.SystemProperties;
import com.sun.javafx.scene.control.skin.IntegerFieldSkin;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by lenovo on 2016/11/28.
 */
public class SchoolDAO<T> {
    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    //获得学校
    public DbkSchoolEntity getSchool(Integer schoolId){
        if(schoolId==null){
            return null;
        }else{
            return hibernateTemplate.get(DbkSchoolEntity.class, schoolId);
        }

    }
}
