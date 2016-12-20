package com.dbk.express.dao;

import com.dbk.express.orm.DbkPickupEntity;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by lenovo on 2016/11/23.
 */
public class PickupDAO<T> {
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

    //获取某寝室今天的代拿的电话名单
    public List<DbkPickupEntity> getPickupToday(Integer dormitoryId) {

        //设置时间段
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd ");
        String today = df.format(new Date()) + "16:00:00";
//        String today = "2016-11-20 16:00:00";
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        String yesterday = new SimpleDateFormat("yyyy-MM-dd ").format(cal.getTime()) + "16:00:00";
//        String yesterday = "2016-11-19 16:00:00";
        Timestamp todayDate = Timestamp.valueOf(today);
        Timestamp yesterdayDate = Timestamp.valueOf(yesterday);

        System.out.println(todayDate);
        System.out.println(yesterdayDate);
        System.out.println(dormitoryId);
        //查找数据，数据为集合
        String hql = "select d from DbkPickupEntity as d where d.payTime>=? and d.payTime<=? and d.dormitoryId=?";

        List<DbkPickupEntity> list = (List<DbkPickupEntity>)hibernateTemplate.find(hql,new Object[]{yesterdayDate,todayDate,dormitoryId});
        return list;

    }
}
