package com.dbk.express.orm;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_pickup", schema = "dbk_express_test", catalog = "")
public class DbkPickupEntity {
    private Integer pickupId;
    private String openid;
    private String receiverName;
    private String receiverPhone;
    private Integer dormitoryId;
    private String expressType;
    private String expressCompany;
    private String expressSms;
    private String expressCode;
    private String remarks;
    private int price;
    private Timestamp payTime;
    private byte expressStatus;
    private DbkDormitoryDialogEntity dormitoryDialogEntity;
    @Id
    @Column(name = "pickup_id")
    public int getPickupId() {
        return pickupId;
    }

    public void setPickupId(int pickupId) {
        this.pickupId = pickupId;
    }

    @Basic
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "receiver_name")
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone")
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "dormitory_id")
    public Integer getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(Integer dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    @Basic
    @Column(name = "express_type")
    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    @Basic
    @Column(name = "express_company")
    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    @Basic
    @Column(name = "express_sms")
    public String getExpressSms() {
        return expressSms;
    }

    public void setExpressSms(String expressSms) {
        this.expressSms = expressSms;
    }

    @Basic
    @Column(name = "express_code")
    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "pay_time")
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "express_status")
    public byte getExpressStatus() {
        return expressStatus;
    }

    public void setExpressStatus(byte expressStatus) {
        this.expressStatus = expressStatus;
    }

    @OneToOne(optional=true,cascade =CascadeType.ALL)/*(mappedBy="dbkPickupEntity")*/
    @JoinColumn(name="pickup_id",referencedColumnName="pickup_id")
    @NotFound(action= NotFoundAction.IGNORE)
    public DbkDormitoryDialogEntity getDormitoryDialogEntity() {
        return dormitoryDialogEntity;
    }

    public void setDormitoryDialogEntity(DbkDormitoryDialogEntity dormitoryDialogEntity) {
        this.dormitoryDialogEntity = dormitoryDialogEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkPickupEntity that = (DbkPickupEntity) o;

        if (pickupId != that.pickupId) return false;
        if (price != that.price) return false;
        if (expressStatus != that.expressStatus) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (receiverPhone != null ? !receiverPhone.equals(that.receiverPhone) : that.receiverPhone != null)
            return false;
        if (dormitoryId != null ? !dormitoryId.equals(that.dormitoryId) : that.dormitoryId != null) return false;
        if (expressType != null ? !expressType.equals(that.expressType) : that.expressType != null) return false;
        if (expressCompany != null ? !expressCompany.equals(that.expressCompany) : that.expressCompany != null)
            return false;
        if (expressSms != null ? !expressSms.equals(that.expressSms) : that.expressSms != null) return false;
        if (expressCode != null ? !expressCode.equals(that.expressCode) : that.expressCode != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (payTime != null ? !payTime.equals(that.payTime) : that.payTime != null) return false;
        return dormitoryDialogEntity != null ? dormitoryDialogEntity.equals(that.dormitoryDialogEntity) : that.dormitoryDialogEntity == null;

    }

    @Override
    public int hashCode() {
        int result = pickupId;
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (dormitoryId != null ? dormitoryId.hashCode() : 0);
        result = 31 * result + (expressType != null ? expressType.hashCode() : 0);
        result = 31 * result + (expressCompany != null ? expressCompany.hashCode() : 0);
        result = 31 * result + (expressSms != null ? expressSms.hashCode() : 0);
        result = 31 * result + (expressCode != null ? expressCode.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (int) expressStatus;
        result = 31 * result + (dormitoryDialogEntity != null ? dormitoryDialogEntity.hashCode() : 0);
        return result;
    }
}
