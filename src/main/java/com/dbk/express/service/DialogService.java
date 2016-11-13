package com.dbk.express.service;

import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DialogDAO;
import com.dbk.express.dao.DormitoryDAO;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/11/11.
 */
@Service
public class DialogService<T> {

    private DialogDAO<T> dialogDAO;
    private DormitoryDAO<T> dormitoryDAO;

    public DialogDAO<T> getDialogDAO() {
        return dialogDAO;
    }

    public void setDialogDAO(DialogDAO<T> dialogDAO) {
        this.dialogDAO = dialogDAO;
    }

    public DormitoryDAO getDormitoryDAO() {
        return dormitoryDAO;
    }

    public void setDormitoryDAO(DormitoryDAO dormitoryDAO) {
        this.dormitoryDAO = dormitoryDAO;
    }

    public String getSchoolAndDormitory()
    {
        return "";
    }

    //拨打电话
    public String dial()
    {
        return "";
    }
}
