package com.dbk.express.controller;

import com.dbk.express.orm.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.pojo.ResponseGenerator;

import com.dbk.express.pojo.errorCode.LoginErrCode;
import com.dbk.express.pojo.errorCode.errCode;
import com.dbk.express.service.AdminService;
import com.mysql.jdbc.log.Log;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * Created by lenovo on 2016/11/10.
 */
@Controller
@SessionAttributes({"admin"})  //此处定义此Controller中将要创建和使用哪些session中的对象名  
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
    @ResponseBody
    public String index(HttpServletResponse response)
    {

        /*DbkAdminEntity admin = new DbkAdminEntity();
        admin.setAdminId("浙江工业大学");
        admin.setAdminPasswd("123456");
        admin.usetAdminSchool(1);

        adminService.create(admin);*/
        return null;
    }


    @RequestMapping(value="/login" )
    @ResponseBody
    public Map login(String userid, String passwd, ModelMap model)
    {

        DbkAdminEntity admin = new DbkAdminEntity();
        LoginErrCode errCode = adminService.verify(userid,passwd,admin);
        if(errCode == LoginErrCode.SUCCESS_TO_LOGIN)         //登录成功，记录session
        {
            model.addAttribute("admin",admin);
        }

        return errCode.getResponseGenerator().generate();

    }
}

