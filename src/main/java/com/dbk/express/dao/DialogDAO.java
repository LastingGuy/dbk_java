package com.dbk.express.dao;

import com.dbk.express.bean.DbkDormitoryDialogEntity;
import org.hibernate.SessionFactory;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

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
    public Boolean getFinishedDialog(String dormitoryId)
    {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(date);
        System.out.println(dormitoryId);
        List<?> objects = hibernateTemplate.find("select c from DbkDormitoryDialogEntity c where date='"+ today +"' and dormitory_id=?",dormitoryId);
        if(objects==null)
            return false;
        else
            return true;
    }
}

