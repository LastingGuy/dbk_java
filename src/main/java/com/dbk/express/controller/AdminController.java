package com.dbk.express.controller;

<<<<<<< HEAD
import com.dbk.express.bean.DbkAdminEntity;
import com.dbk.express.dao.AdminDAO;
import com.dbk.express.pojo.ResponseGenerator;
=======
import com.dbk.express.orm.DbkAdminEntity;
>>>>>>> master
import com.dbk.express.service.AdminService;
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
<<<<<<< HEAD
import java.util.Map;
=======
>>>>>>> master

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
        admin.setAdminSchool(1);

        adminService.create(admin);*/
        return null;
    }

    //登录验证
<<<<<<< HEAD
    @RequestMapping(value="/login",method = RequestMethod.GET)
    @ResponseBody
    public Map login(@RequestParam("username") String username, @RequestParam("passwd") String passwd, HttpSession session)
    {
        ResponseGenerator response  = new ResponseGenerator("login");
        if(adminService.login(username,passwd))
        {
            session.setAttribute("username",username);
            response.setSuccess(true);
            response.setMsg("登陆成功");
        }
        else
        {
            response.setMsg("登陆失败");
        }
        return response.generate();
=======
    @RequestMapping(value="/login" )
    @ResponseBody
    public String login(String userid, String passwd, ModelMap model, HttpSession session)
    {

        DbkAdminEntity admin = adminService.verify(userid,passwd);
        model.addAttribute("admin",admin);
        //session.setAttribute("admin",admin);
        return "haha";
>>>>>>> master
    }
}

