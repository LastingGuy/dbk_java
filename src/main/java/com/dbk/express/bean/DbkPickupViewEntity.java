package com.dbk.express.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_pickup_view", schema = "dbk_express_test", catalog = "")
public class DbkPickupViewEntity {
    private int schoolId;
    private String schoolCity;
    private String schoolName;
    private String dormitoryAddress;
    private Integer dormitoryId;
    private String expressCode;
    private String expressCompany;
    private String expressSms;
    private byte expressStatus;
    private String expressType;
    private int pickupId;
    private int price;
    private String receiverName;
    private String receiverPhone;
    private String remarks;
    private Timestamp time;
    private String openid;

    @Basic
    @Column(name = "school_id")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "school_city")
    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    @Basic
    @Column(name = "school_name")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "dormitory_address")
    public String getDormitoryAddress() {
        return dormitoryAddress;
    }

    public void setDormitoryAddress(String dormitoryAddress) {
        this.dormitoryAddress = dormitoryAddress;
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
    @Column(name = "express_code")
    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
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
    @Column(name = "express_status")
    public byte getExpressStatus() {
        return expressStatus;
    }

    public void setExpressStatus(byte expressStatus) {
        this.expressStatus = expressStatus;
    }

    @Basic
    @Column(name = "express_type")
    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    @Id
    @Column(name = "pickup_id")
    public int getPickupId() {
        return pickupId;
    }

    public void setPickupId(int pickupId) {
        this.pickupId = pickupId;
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
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkPickupViewEntity that = (DbkPickupViewEntity) o;

        if (schoolId != that.schoolId) return false;
        if (expressStatus != that.expressStatus) return false;
        if (pickupId != that.pickupId) return false;
        if (price != that.price) return false;
        if (schoolCity != null ? !schoolCity.equals(that.schoolCity) : that.schoolCity != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (dormitoryAddress != null ? !dormitoryAddress.equals(that.dormitoryAddress) : that.dormitoryAddress != null)
            return false;
        if (dormitoryId != null ? !dormitoryId.equals(that.dormitoryId) : that.dormitoryId != null) return false;
        if (expressCode != null ? !expressCode.equals(that.expressCode) : that.expressCode != null) return false;
        if (expressCompany != null ? !expressCompany.equals(that.expressCompany) : that.expressCompany != null)
            return false;
        if (expressSms != null ? !expressSms.equals(that.expressSms) : that.expressSms != null) return false;
        if (expressType != null ? !expressType.equals(that.expressType) : that.expressType != null) return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (receiverPhone != null ? !receiverPhone.equals(that.receiverPhone) : that.receiverPhone != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId;
        result = 31 * result + (schoolCity != null ? schoolCity.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (dormitoryAddress != null ? dormitoryAddress.hashCode() : 0);
        result = 31 * result + (dormitoryId != null ? dormitoryId.hashCode() : 0);
        result = 31 * result + (expressCode != null ? expressCode.hashCode() : 0);
        result = 31 * result + (expressCompany != null ? expressCompany.hashCode() : 0);
        result = 31 * result + (expressSms != null ? expressSms.hashCode() : 0);
        result = 31 * result + (int) expressStatus;
        result = 31 * result + (expressType != null ? expressType.hashCode() : 0);
        result = 31 * result + pickupId;
        result = 31 * result + price;
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        return result;
    }
}
