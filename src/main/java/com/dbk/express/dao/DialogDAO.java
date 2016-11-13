package com.dbk.express.dao;

import com.dbk.express.bean.DbkDormitoryDialogEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by lenovo on 2016/11/13.
 */

public class DialogDAO<T> {

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

    //根据时间和寝室楼号获取已经拨打的情况
    public DbkDormitoryDialogEntity getFinishedDialog()
    {
        return null;
    }
}
