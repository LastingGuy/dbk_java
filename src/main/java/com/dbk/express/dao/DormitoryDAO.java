package com.dbk.express.dao;

import com.dbk.express.orm.DbkDormitoryEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by lenovo on 2016/11/13.
 */
public class DormitoryDAO<T> {
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

    //根据学校获取寝室楼集合
    public List<DbkDormitoryEntity> getDorsBySchool(Integer schoolId)
    {
         List<DbkDormitoryEntity> list = (List<DbkDormitoryEntity>) this.hibernateTemplate.find("select d from DbkDormitoryEntity d where d.schoolId = ?",schoolId);

        return list;
    }
}
