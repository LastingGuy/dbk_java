package com.dbk.express.bean;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_dormitory", schema = "dbk_express_test", catalog = "")
public class DbkDormitoryEntity {
    private int dormitoryId;
    private Integer schoolId;
    private String dormitoryAddress;

    @Id
    @Column(name = "dormitory_id")
    public int getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(int dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    @Basic
    @Column(name = "school_id")
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "dormitory_address")
    public String getDormitoryAddress() {
        return dormitoryAddress;
    }

    public void setDormitoryAddress(String dormitoryAddress) {
        this.dormitoryAddress = dormitoryAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkDormitoryEntity that = (DbkDormitoryEntity) o;

        if (dormitoryId != that.dormitoryId) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (dormitoryAddress != null ? !dormitoryAddress.equals(that.dormitoryAddress) : that.dormitoryAddress != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dormitoryId;
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + (dormitoryAddress != null ? dormitoryAddress.hashCode() : 0);
        return result;
    }
}
