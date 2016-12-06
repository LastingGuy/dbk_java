package com.dbk.express.controller;

import com.dbk.express.bean.SchoolDormitory;
import com.dbk.express.orm.DbkAdminEntity;
import com.dbk.express.service.SchoolService;
import com.dbk.express.service.DialogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/10.
 */

@Controller
@SessionAttributes({"admin"})
public class SchoolController {

    @Autowired
    private DialogService dialogService;

    @Autowired
    private SchoolService schoolService;

    public DialogService getDialogService() {
        return dialogService;
    }

    public void setDialogService(DialogService dialogService) {
        this.dialogService = dialogService;
    }

    public SchoolService getSchoolService() {
        return schoolService;
    }

    public void setSchoolService(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    //获取学校及寝室楼，以及是否完成拨打的数据
    @RequestMapping(value="/school")
    @ResponseBody
    public SchoolDormitory getSchoolAndDormitory(@ModelAttribute("admin") DbkAdminEntity admin,HttpSession session)
    {
        //DbkAdminEntity admin = (DbkAdminEntity) session.getAttribute("admin");
        System.out.println(admin.getAdminPasswd());
        //return null;
        return schoolService.getSchoolandDormitory(admin.getAdminSchool());
    }


    //按照单号进行拨打
    @RequestMapping(value="/dial")
    @ResponseBody
    public String dial(@RequestParam("pickupid") Integer[] pickupid)
    {

        dialogService.dial(pickupid);
        return "sadsada";
    }

    //根据寝室楼获得今日代拿列表
    @RequestMapping(value="/order")
    @ResponseBody
    public List getStudentList(@RequestParam("dormitoryid") Integer dormitoryId)
    {
        return schoolService.getPickup(dormitoryId);
    }
}
