package com.dbk.express.orm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_send", schema = "dbk_express_test", catalog = "")
public class DbkSendEntity {
    private int sendId;
    private String openid;
    private String senderName;
    private String senderPhone;
    private Integer dormitoryId;
    private String senderGoods;
    private String remarks;
    private Timestamp time;
    private byte senderStatus;
    private String destination;

    @Id
    @Column(name = "send_id")
    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
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
    @Column(name = "sender_status")
    public byte getSenderStatus() {
        return senderStatus;
    }

    public void setSenderStatus(byte senderStatus) {
        this.senderStatus = senderStatus;
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

        DbkSendEntity that = (DbkSendEntity) o;

        if (sendId != that.sendId) return false;
        if (senderStatus != that.senderStatus) return false;
        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (senderName != null ? !senderName.equals(that.senderName) : that.senderName != null) return false;
        if (senderPhone != null ? !senderPhone.equals(that.senderPhone) : that.senderPhone != null) return false;
        if (dormitoryId != null ? !dormitoryId.equals(that.dormitoryId) : that.dormitoryId != null) return false;
        if (senderGoods != null ? !senderGoods.equals(that.senderGoods) : that.senderGoods != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sendId;
        result = 31 * result + (openid != null ? openid.hashCode() : 0);
        result = 31 * result + (senderName != null ? senderName.hashCode() : 0);
        result = 31 * result + (senderPhone != null ? senderPhone.hashCode() : 0);
        result = 31 * result + (dormitoryId != null ? dormitoryId.hashCode() : 0);
        result = 31 * result + (senderGoods != null ? senderGoods.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (int) senderStatus;
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        return result;
    }
}
