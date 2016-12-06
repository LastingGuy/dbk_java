package com.dbk.express.orm;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_admin", schema = "dbk_express_test", catalog = "")
public class DbkAdminEntity {
    private String adminId;
    private String adminPasswd;
    private Integer adminSchool;

    @Id
    @Column(name = "admin_id")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_passwd")
    public String getAdminPasswd() {
        return adminPasswd;
    }

    public void setAdminPasswd(String adminPasswd) {
        this.adminPasswd = adminPasswd;
    }

    @Basic
    @Column(name = "admin_school")
    public Integer getAdminSchool() {
        return adminSchool;
    }

    public void setAdminSchool(Integer adminSchool) {
        this.adminSchool = adminSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkAdminEntity that = (DbkAdminEntity) o;

        if (adminId != null ? !adminId.equals(that.adminId) : that.adminId != null) return false;
        if (adminPasswd != null ? !adminPasswd.equals(that.adminPasswd) : that.adminPasswd != null) return false;
        if (adminSchool != null ? !adminSchool.equals(that.adminSchool) : that.adminSchool != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (adminPasswd != null ? adminPasswd.hashCode() : 0);
        result = 31 * result + (adminSchool != null ? adminSchool.hashCode() : 0);
        return result;
    }
}
