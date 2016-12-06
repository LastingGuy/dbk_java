package com.dbk.express.orm;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/13.
 */
@Entity
@Table(name="dbk_dormitory_dialog",schema="dbk_express_test",catalog = "")
public class DbkDormitoryDialogEntity implements Serializable {

    @Id
    @Column(name="pickup_id",insertable = false,updatable = false)
    private Integer pickupId;
    @Basic
    @Column(name="dialog_time")
    private Timestamp dialogTime;



    /*@OneToOne*//*(mappedBy="dormitoryDialogEntity")*//*
    @PrimaryKeyJoinColumn
    *//*@JoinColumn(name="pickup_id",referencedColumnName="pickup_id")*//*(cascade=CascadeType.ALL,targetEntity=DbkPickupEntity.class)*//*
    private DbkPickupEntity dbkPickupEntity;*/


    public Integer getPickupId() {
        return pickupId;
    }

    public void setPickupId(Integer pickupId) {
        this.pickupId = pickupId;
    }

    public Timestamp getDialogTime() {
        return dialogTime;
    }

    public void setDialogTime(Timestamp dialogTime) {
        this.dialogTime = dialogTime;
    }

//    public DbkPickupEntity getDbkPickupEntity() {
//        return dbkPickupEntity;
//    }
//
//    public void setDbkPickupEntity(DbkPickupEntity dbkPickupEntity) {
//        this.dbkPickupEntity = dbkPickupEntity;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkDormitoryDialogEntity that = (DbkDormitoryDialogEntity) o;

        if (pickupId != null ? !pickupId.equals(that.pickupId) : that.pickupId != null) return false;
        return dialogTime != null ? dialogTime.equals(that.dialogTime) : that.dialogTime == null;

    }

    @Override
    public int hashCode() {
        int result = pickupId != null ? pickupId.hashCode() : 0;
        result = 31 * result + (dialogTime != null ? dialogTime.hashCode() : 0);
        return result;
    }
}
