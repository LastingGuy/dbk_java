package com.dbk.express.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_send_view", schema = "dbk_express_test", catalog = "")
public class DbkSendViewEntity {
    private int schoolId;
    private String schoolCity;
    private String schoolName;
    private String dormitoryAddress;
    private Integer dormitoryId;
    private String senderGoods;
    private byte senderStatus;
    private int sendId;
    private String senderName;
    private String senderPhone;
    private String remarks;
    private Timestamp time;
    private String openid;
    private String destination;

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
    @Column(name = "sender_goods")
    public String getSenderGoods() {
        return senderGoods;
    }

    public void setSenderGoods(String senderGoods) {
        this.senderGoods = senderGoods;
    }

    @Basic
    @Column(name = "sender_status")
    public byte getSenderStatus() {
        return senderStatus;
    }

    public void setSenderStatus(byte senderStatus) {
        this.senderStatus = senderStatus;
    }

    @Id
    @Column(name = "send_id")
    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    @Basic
    @Column(name = "sender_name")
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "sender_phone")
    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
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

    @Basic
    @Column(name = "destination")
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkSendViewEntity that = (DbkSendViewEntity) o;

        if (schoolId != that.schoolId) return false;
        if (senderStatus != that.senderStatus) return false;
        if (sendId != that.sendId) return false;
        if (schoolCity != null ? !schoolCity.equals(that.schoolCity) : that.schoolCity != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (dormitoryAddress != null ? !dormitoryAddress.equals(that.dormitoryAddress) : that.dormitoryAddress != null)
            return false;
        if (dormitoryId != null ? !dormitoryId.equals(that.dormitoryId) : that.dormitoryId != null) return false;
        if (senderGoods != null ? !senderGoods.equals(that.senderGoods) : that.senderGoods != null) return false;
        if (senderName != null ? !senderName.equals(that.senderName) : that.senderName != null) return false;
        if (senderPhone != null ? !senderPhone.equals(that.senderPhone) : that.senderPhone != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId;
        result = 31 * result + (schoolCity != null ? schoolCity.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (dormitoryAddress != null ? dormitoryAddress.hashCode() : 0);
        result = 31 * result + (dormitoryId != null ? dormitoryId.hashCode() : 0);
        result = 31 * result + (senderGoods != null ? senderGoods.hashCode() : 0);
        result = 31 * result + (int) senderStatus;
        result = 31 * result + sendId;
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        result = 31 * result + (senderPhone != null ? senderPhone.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        return result;
    }
}
