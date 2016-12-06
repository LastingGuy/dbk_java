package com.dbk.express.dao;

import com.dbk.express.orm.DbkDormitoryDialogEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    //根据订单号获取已经拨打的情况
    public Boolean getFinishedDialog(Integer pickupId)
    {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(date);
        List<?> objects = hibernateTemplate.find("from DbkDormitoryDialogEntity c where c.pickupId=? ",pickupId);

        //找到返回true，没找到返回false
        if(objects.size()==1)
            return true;
        else
            return false;
    }

    //插入拨打后的寝室号
    public void insertDialog(Integer pickupId)
    {
        Date date = new Date();


        DbkDormitoryDialogEntity dbkDormitoryDialogEntity= new DbkDormitoryDialogEntity();
        dbkDormitoryDialogEntity.setPickupId(pickupId);
        dbkDormitoryDialogEntity.setDialogTime(new Timestamp(date.getTime()));

        hibernateTemplate.save(dbkDormitoryDialogEntity);

    }
}

