package com.dbk.express.service;

import com.dbk.express.dao.DormitoryDAO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ben on 2016/11/14.
 */
@Service
public class DormitoryService<T> {
    private DormitoryDAO<T> dormitoryDAO;

    public DormitoryDAO<T> getDormitoryDAO()
    {
        return this.dormitoryDAO;
    }

    public void setDormitoryDAO(DormitoryDAO<T> dormitoryDAO)
    {
        this.dormitoryDAO = dormitoryDAO;
    }

    public List<T> getDorsByAdminID(String id)
    {
        return this.dormitoryDAO.getDorsByAdminID(id);
    }
}
