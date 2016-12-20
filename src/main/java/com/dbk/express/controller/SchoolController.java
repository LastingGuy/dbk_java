package com.dbk.express.controller;

import com.dbk.express.orm.DbkAdminEntity;
import com.dbk.express.pojo.errorCode.dialErrCode;
import com.dbk.express.pojo.errorCode.errCode;
import com.dbk.express.service.SchoolService;
import com.dbk.express.service.DialogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public Map getSchoolAndDormitory(ModelMap model)
    {
        DbkAdminEntity admin = (DbkAdminEntity) model.get("admin");
        if(admin==null)
        {
            return errCode.NOT_LOGIN.getResponseGenerator("getSchoolAndDormitory").generate();
        }
        Object body = schoolService.getSchoolandDormitory(admin.getAdminSchool());
        if(body==null)
        {
            return  errCode.FAIL.getResponseGenerator("getSchoolAndDormitory")
                    .setMsg("no dormitory information").generate();
        }
        return errCode.OK.getResponseGenerator("getSchoolAndDormitory").setBody(body).generate();
    }


    //按照单号进行拨打
    @RequestMapping(value="/dial")
    @ResponseBody
    public Map dial(@RequestParam("pickupid") Integer[] pickupid,ModelMap model)
    {
        if(model.get("admin")==null)
        {
            return dialErrCode.NOT_LOGIN.getResponseGenerator().generate();
        }
        return dialogService.dial(pickupid).getResponseGenerator().generate();

    }

    //根据寝室楼获得今日代拿列表
    @RequestMapping(value="/order")
    @ResponseBody
    public Map getStudentList(@RequestParam("dormitoryid") Integer dormitoryId,ModelMap model)
    {
        if(model.get("admin")==null)
        {
            return errCode.NOT_LOGIN.getResponseGenerator("getOrders").generate();
        }

        Object orders = schoolService.getPickup(dormitoryId);
        return errCode.OK.getResponseGenerator("getOrders").setBody(orders).generate();

    }

    //通过配合@ResponseBody来将内容或者对象作为HTTP响应正文返回（适合做即时校验）；
    @RequestMapping(value = "/valid", method = RequestMethod.GET)
    @ResponseBody
    public String valid(@RequestParam(value = "userId", required = false) Integer userId,
                        @RequestParam(value = "name") String name, Model model) {
        model.addAttribute("haha","haha");
        return String.valueOf(true);
    }

}
