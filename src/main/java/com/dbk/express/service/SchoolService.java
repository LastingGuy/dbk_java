package com.dbk.express.service;

import com.dbk.express.bean.SchoolDormitory;
import com.dbk.express.dao.DialogDAO;
import com.dbk.express.dao.DormitoryDAO;
import com.dbk.express.dao.PickupDAO;
import com.dbk.express.dao.SchoolDAO;
import com.dbk.express.orm.DbkDormitoryEntity;
import com.dbk.express.orm.DbkPickupEntity;
import com.dbk.express.orm.DbkSchoolEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/23.
 */
@Service
public class SchoolService<T> {
    private DialogDAO<T> dialogDAO;
    private DormitoryDAO<T> dormitoryDAO;
    private SchoolDAO<T> schoolDAO;
    private PickupDAO<T> pickupDAO;

    public PickupDAO<T> getPickupDAO() {
        return pickupDAO;
    }

    public void setPickupDAO(PickupDAO<T> pickupDAO) {
        this.pickupDAO = pickupDAO;
    }

    public SchoolDAO<T> getSchoolDAO() {
        return schoolDAO;
    }

    public void setSchoolDAO(SchoolDAO<T> schoolDAO) {
        this.schoolDAO = schoolDAO;
    }

    public DialogDAO<T> getDialogDAO() {
        return dialogDAO;
    }

    public void setDialogDAO(DialogDAO<T> dialogDAO) {
        this.dialogDAO = dialogDAO;
    }

    public DormitoryDAO<T> getDormitoryDAO() {
        return dormitoryDAO;
    }

    public void setDormitoryDAO(DormitoryDAO<T> dormitoryDAO) {
        this.dormitoryDAO = dormitoryDAO;
    }

    /*//得到该用户的学校，寝室信息，以及是否完成今日拨打
    public Map<String, Object> getSchoolNameAndDorsByAdminID(String id)
    {
        Map<String,Object> map = new HashedMap();
        map.put("school",adminDAO.getSchoolNameByAdminID(id));
        map.put("dors",dormitoryDAO.getDorsByAdminID(id));

        return map;
    }*/

    //得到该用户的学校，寝室信息
    public SchoolDormitory getSchoolandDormitory(Integer schoolId)
    {
        try
        {
            SchoolDormitory schoolDormitory = new SchoolDormitory();

            //获得学校名字
            DbkSchoolEntity dbkSchoolEntity = schoolDAO.getSchool(schoolId);
            schoolDormitory.setSchoolId(dbkSchoolEntity.getSchoolId());
            schoolDormitory.setSchoolName(dbkSchoolEntity.getSchoolName());

            //获得学校寝室
            List<DbkDormitoryEntity> list = dormitoryDAO.getDorsBySchool(schoolId);
            schoolDormitory.setDormitories(list);

            return schoolDormitory;
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //得到某寝室的订单
    public List getPickup(Integer dormitoryId){
        //
        List<DbkPickupEntity> list = pickupDAO.getPickupToday(dormitoryId);
        List<Object[]> list2 = new ArrayList<Object[]>();
        for(DbkPickupEntity pickup:list)
        {
            Object[] objects = new Object[3];
            if(pickup.getDormitoryDialogEntity()!=null){
                objects[0] = pickup.getReceiverName();
                objects[1] = pickup.getReceiverPhone();
                objects[2] = pickup.getDormitoryDialogEntity().getDialogTime();
            }
            else{
                objects[0] = pickup.getReceiverName();
                objects[1] = pickup.getReceiverPhone();
                objects[2] = null;
            }
            list2.add(objects);
        }
        return list2;
    }
}
