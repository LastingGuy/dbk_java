package com.dbk.express.controller;

import com.dbk.express.bean.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.service.DialogService;
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
public class SchoolController {

    @Autowired
    private DialogService dialogService;

    public DialogService getDialogService() {
        return dialogService;
    }

    public void setDialogService(DialogService dialogService) {
        this.dialogService = dialogService;
    }

    //获取学校及寝室楼，以及是否完成拨打的数据
    @RequestMapping(value="/school")
    @ResponseBody
    public String getSchoolAndDormitory(HttpServletResponse response)
    {
        /*DbkAdminEntity admin = new DbkAdminEntity();
        admin.setAdminId("浙江工业大学");
        admin.setAdminPasswd("123456");
        admin.setAdminSchool(1);

        adminService.create(admin);*/
        response.setHeader("Access-Control-Allow-Origin","*");
        return "index";
    }

    //根据寝室号完成一键拨打
    @RequestMapping(value="/d")
    @ResponseBody
    public String dial()
    {
        return "";
    }
}
