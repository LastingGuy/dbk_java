package com.dbk.express.orm;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_express_company", schema = "dbk_express_test", catalog = "")
@IdClass(DbkExpressCompanyEntityPK.class)
public class DbkExpressCompanyEntity {
    private int schoolId;
    private String expressCompanyName;

    @Id
    @Column(name = "school_id")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Id
    @Column(name = "express_company_name")
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

        DbkExpressCompanyEntity that = (DbkExpressCompanyEntity) o;

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
