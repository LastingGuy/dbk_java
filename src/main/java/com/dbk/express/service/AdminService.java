package com.dbk.express.service;

import com.dbk.express.orm.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DormitoryDAO;
import com.dbk.express.pojo.errorCode.LoginErrCode;
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
    public LoginErrCode verify(String userid, String passwd, DbkAdminEntity admin){

        //验证账号密码
        DbkAdminEntity temp = adminDAO.find(userid);

        //无此账号
        if(temp==null){
            return LoginErrCode.NO_SUCH_ACCOUNT;
        }

        if(!temp.getAdminPasswd().equals(passwd)){
            return LoginErrCode.PASSWORD_IS_WRONG;
        }

        admin.setAdminId(temp.getAdminId());
        admin.setAdminPasswd(temp.getAdminPasswd());
        admin.setAdminSchool(temp.getAdminSchool());
        return LoginErrCode.SUCCESS_TO_LOGIN;
    }


}
