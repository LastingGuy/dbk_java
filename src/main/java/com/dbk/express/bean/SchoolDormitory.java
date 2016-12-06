package com.dbk.express.bean;

import java.util.List;

/**
 * Created by lenovo on 2016/11/28.
 */
public class SchoolDormitory {
    private int schoolId;
    private String schoolName;
    private List dormitories;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List getDormitories() {
        return dormitories;
    }

    public void setDormitories(List dormitories) {
        this.dormitories = dormitories;
    }
}
