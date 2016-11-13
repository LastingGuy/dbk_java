package com.dbk.express.controller;

import com.dbk.express.bean.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2016/11/10.
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    //登录页面
    @RequestMapping(value="/index")
    public String index(HttpServletResponse response)
    {
        /*DbkAdminEntity admin = new DbkAdminEntity();
        admin.setAdminId("浙江工业大学");
        admin.setAdminPasswd("123456");
        admin.setAdminSchool(1);

        adminService.create(admin);*/
        response.setHeader("Access-Control-Allow-Origin","*");
        return "index";
    }

    //登录验证
    @RequestMapping(value="/login")
    @ResponseBody
    public String login()
    {
        return "";
    }
}
