package com.dbk.express.bean;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_defaultinfo", schema = "dbk_express_test", catalog = "")
public class DbkDefaultinfoEntity {
    private String openid;
    private String defaultName;
    private String defaultCity;
    private String defaultSchool;
    private String defaultDormitory;
    private String defaultPhone;

    @Id
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "default_name")
    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @Basic
    @Column(name = "default_city")
    public String getDefaultCity() {
        return defaultCity;
    }

    public void setDefaultCity(String defaultCity) {
        this.defaultCity = defaultCity;
    }

    @Basic
    @Column(name = "default_school")
    public String getDefaultSchool() {
        return defaultSchool;
    }

    public void setDefaultSchool(String defaultSchool) {
        this.defaultSchool = defaultSchool;
    }

    @Basic
    @Column(name = "default_dormitory")
    public String getDefaultDormitory() {
        return defaultDormitory;
    }

    public void setDefaultDormitory(String defaultDormitory) {
        this.defaultDormitory = defaultDormitory;
    }

    @Basic
    @Column(name = "default_phone")
    public String getDefaultPhone() {
        return defaultPhone;
    }

    public void setDefaultPhone(String defaultPhone) {
        this.defaultPhone = defaultPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkDefaultinfoEntity that = (DbkDefaultinfoEntity) o;

        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (defaultName != null ? !defaultName.equals(that.defaultName) : that.defaultName != null) return false;
        if (defaultCity != null ? !defaultCity.equals(that.defaultCity) : that.defaultCity != null) return false;
        if (defaultSchool != null ? !defaultSchool.equals(that.defaultSchool) : that.defaultSchool != null)
            return false;
        if (defaultDormitory != null ? !defaultDormitory.equals(that.defaultDormitory) : that.defaultDormitory != null)
            return false;
        if (defaultPhone != null ? !defaultPhone.equals(that.defaultPhone) : that.defaultPhone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = openid != null ? openid.hashCode() : 0;
        result = 31 * result + (defaultName != null ? defaultName.hashCode() : 0);
        result = 31 * result + (defaultCity != null ? defaultCity.hashCode() : 0);
        result = 31 * result + (defaultSchool != null ? defaultSchool.hashCode() : 0);
        result = 31 * result + (defaultDormitory != null ? defaultDormitory.hashCode() : 0);
        result = 31 * result + (defaultPhone != null ? defaultPhone.hashCode() : 0);
        return result;
    }
}
