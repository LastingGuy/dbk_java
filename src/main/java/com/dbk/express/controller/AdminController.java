package com.dbk.express.controller;

import com.dbk.express.bean.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2016/11/10.
 */
@Controller
public class AdminController {

    @RequestMapping(value="/index")
    @ResponseBody
    public String index()
    {
        DbkAdminEntity admin = new DbkAdminEntity();
        admin.setAdminId("浙江工业大学");
        admin.setAdminPasswd("123456");
        admin.setAdminSchool(1);

        AdminDAO<DbkAdminEntity> adminDao = new AdminDAO<DbkAdminEntity>();
        adminDao.create(admin);

        return "index";
    }
}
