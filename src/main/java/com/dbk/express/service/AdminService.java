package com.dbk.express.service;

import com.dbk.express.dao.AdminDAO;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/11/11.
 */
@Service
public class AdminService<T> {
    private AdminDAO<T> adminDAO;

    public AdminDAO<T> getAdminDAO() {
        return adminDAO;
    }

    public void setAdminDAO(AdminDAO<T> adminDAO) {
        this.adminDAO = adminDAO;
    }

    public void create(T object){
        adminDAO.create(object);
    }
}
