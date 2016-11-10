package com.dbk.express.dao;

import com.dbk.express.util.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by lenovo on 2016/11/10.
 */
public class AdminDAO<T> {

    //插入数据
    public void create(T object){
        Session session = HibernateUtil.getSessionFactory().openSession();

        try{
            session.beginTransaction();
            session.persist(object);
            session.getTransaction().commit();
        }catch(Exception e){
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

    }
}
