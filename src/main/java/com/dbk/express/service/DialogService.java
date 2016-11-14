package com.dbk.express.service;

import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DialogDAO;
import com.dbk.express.dao.DormitoryDAO;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcTtsNumSinglecallRequest;
import com.taobao.api.response.AlibabaAliqinFcTtsNumSinglecallResponse;
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

        String url = "http://gw.api.taobao.com/router/rest";
        String appkey = "23531930";
        String secret = "d2542deb5da568dc053201c8f6758c23";

        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcTtsNumSinglecallRequest req = new AlibabaAliqinFcTtsNumSinglecallRequest();
        req.setExtend("12345");
        req.setTtsParamString("");
        req.setCalledNum("17826875244");
        req.setCalledShowNum("01053912805");
        req.setTtsCode("TTS_26080088");
        AlibabaAliqinFcTtsNumSinglecallResponse rsp;
        try {
            rsp = client.execute(req);
            System.out.println(rsp.getBody());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return "";
    }
}
