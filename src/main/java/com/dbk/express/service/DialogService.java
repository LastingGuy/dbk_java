package com.dbk.express.service;

import com.dbk.express.dao.AdminDAO;
import com.dbk.express.dao.DialogDAO;
import com.dbk.express.dao.DormitoryDAO;
import com.dbk.express.dao.PickupDAO;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcTtsNumSinglecallRequest;
import com.taobao.api.response.AlibabaAliqinFcTtsNumSinglecallResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.comparator.BooleanComparator;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/11.
 */
@Service
public class DialogService<T> {

    private DialogDAO<T> dialogDAO;
    private DormitoryDAO<T> dormitoryDAO;
    private PickupDAO<T> pickupDAO;

    public DialogDAO<T> getDialogDAO() {
        return dialogDAO;
    }

    public void setDialogDAO(DialogDAO<T> dialogDAO) {
        this.dialogDAO = dialogDAO;
    }

    public DormitoryDAO getDormitoryDAO() {
        return dormitoryDAO;
    }

    public void setDormitoryDAO(DormitoryDAO<T> dormitoryDAO) {
        this.dormitoryDAO = dormitoryDAO;
    }

    public PickupDAO<T> getPickupDAO() {
        return pickupDAO;
    }

    public void setPickupDAO(PickupDAO<T> pickupDAO) {
        this.pickupDAO = pickupDAO;
    }

    //拨打电话
    public String dial(Integer[] pickupId)
    {

        for(int i = 0;i<pickupId.length;i++)
        {


            //查看该订单是否已经完成拨打，返回true为已拨打，返回false为未拨打
            Boolean flag = dialogDAO.getFinishedDialog(pickupId[i]);
            System.out.println(flag);
            if(flag==true)
            {
                return "";
            }


           /*
            //拨打电话
            String url = "http://gw.api.tbsandbox.com/router/rest";
            String appkey = "23531930";
            String secret = "d2542deb5da568dc053201c8f6758c23";

            TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
            AlibabaAliqinFcTtsNumSinglecallRequest req = new AlibabaAliqinFcTtsNumSinglecallRequest();
            req.setExtend("12345");
            req.setTtsParamString("");
            req.setCalledNum("13732218844");
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
            */

            //插入拨打好的寝室
            dialogDAO.insertDialog(pickupId[i]);
        }
        return "";

    }


}
