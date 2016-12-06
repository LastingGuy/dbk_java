package com.dbk.express.service;

import com.dbk.express.orm.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DormitoryDAO;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/11/11.
 */
@Service
public class AdminService<T> {
    private AdminDAO<T> adminDAO;
    private DormitoryDAO<T> dormitoryDAO;

    public AdminDAO<T> getAdminDAO() {
        return adminDAO;
    }

    public void setAdminDAO(AdminDAO<T> adminDAO) {
        this.adminDAO = adminDAO;
    }

    public DormitoryDAO<T> getDormitoryDAO(){return dormitoryDAO;};

    public void setDormitoryDAO(DormitoryDAO<T> dormitoryDAO){
        this.dormitoryDAO = dormitoryDAO;
    }

    public void create(T object)
    {
        adminDAO.create(object);
    }

    //验证账号密码
    public DbkAdminEntity verify(String userid, String passwd){

        //验证账号密码
        DbkAdminEntity admin = adminDAO.find(userid);

        //无此账号
        if(admin==null){
            return null;
        }

        if(!admin.getAdminPasswd().equals(passwd)){
            return null;
        }

        return admin;
    }

    //登陆
    public boolean login(String username,String passwd)
    {
        return adminDAO.login(username, passwd);
    }
}
