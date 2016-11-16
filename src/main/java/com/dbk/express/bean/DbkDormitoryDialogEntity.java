package com.dbk.express.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.security.Timestamp;

/**
 * Created by lenovo on 2016/11/13.
 */
@Entity
@Table(name="dbk_dormitory_dialog",schema="dbk_express_test",catalog = "")
public class DbkDormitoryDialogEntity implements Serializable {
    private int dormitoryId;
    private Timestamp date;
    private Timestamp time;

    @Id
    @Column(name="dormitory_id")
    public int getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(int dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    @Id
    @Column(name="date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name="date")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}
