package com.dbk.express.service;

import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DormitoryDAO;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Service;

import java.util.Map;

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

    public Map<String, Object> getSchoolNameAndDorsByAdminID(String id)
    {
        Map<String,Object> map = new HashedMap();
        map.put("school",adminDAO.getSchoolNameByAdminID(id));
        map.put("dors",dormitoryDAO.getDorsByAdminID(id));

        return map;
    }
}
