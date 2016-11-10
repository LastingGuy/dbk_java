package com.dbk.express.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lenovo on 2016/11/10.
 */
public class DbkExpressCompanyEntityPK implements Serializable {
    private int schoolId;
    private String expressCompanyName;

    @Column(name = "school_id")
    @Id
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Column(name = "express_company_name")
    @Id
    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkExpressCompanyEntityPK that = (DbkExpressCompanyEntityPK) o;

        if (schoolId != that.schoolId) return false;
        if (expressCompanyName != null ? !expressCompanyName.equals(that.expressCompanyName) : that.expressCompanyName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId;
        result = 31 * result + (expressCompanyName != null ? expressCompanyName.hashCode() : 0);
        return result;
    }
}
