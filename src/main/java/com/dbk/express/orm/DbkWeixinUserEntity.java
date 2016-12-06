package com.dbk.express.orm;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_weixin_user", schema = "dbk_express_test", catalog = "")
public class DbkWeixinUserEntity {
    private String openid;
    private String nickname;
    private String headimgurl;
    private Timestamp registerTime;

    @Id
    @Column(name = "openid")
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "headimgurl")
    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    @Basic
    @Column(name = "register_time")
    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkWeixinUserEntity that = (DbkWeixinUserEntity) o;

        if (openid != null ? !openid.equals(that.openid) : that.openid != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (headimgurl != null ? !headimgurl.equals(that.headimgurl) : that.headimgurl != null) return false;
        if (registerTime != null ? !registerTime.equals(that.registerTime) : that.registerTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = openid != null ? openid.hashCode() : 0;
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (headimgurl != null ? headimgurl.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        return result;
    }
}
