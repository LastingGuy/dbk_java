package com.dbk.express.orm;

import javax.persistence.*;

/**
 * Created by lenovo on 2016/11/10.
 */
@Entity
@Table(name = "dbk_school", schema = "dbk_express_test", catalog = "")
public class DbkSchoolEntity {
    private int schoolId;
    private String schoolName;
    private String schoolCity;
    private Double smallPrice;
    private Double midPrice;
    private Double largePrice;

    @Id
    @Column(name = "school_id")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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
    @Column(name = "school_city")
    public String getSchoolCity() {
        return schoolCity;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    @Basic
    @Column(name = "small_price")
    public Double getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(Double smallPrice) {
        this.smallPrice = smallPrice;
    }

    @Basic
    @Column(name = "mid_price")
    public Double getMidPrice() {
        return midPrice;
    }

    public void setMidPrice(Double midPrice) {
        this.midPrice = midPrice;
    }

    @Basic
    @Column(name = "large_price")
    public Double getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(Double largePrice) {
        this.largePrice = largePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DbkSchoolEntity that = (DbkSchoolEntity) o;

        if (schoolId != that.schoolId) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (schoolCity != null ? !schoolCity.equals(that.schoolCity) : that.schoolCity != null) return false;
        if (smallPrice != null ? !smallPrice.equals(that.smallPrice) : that.smallPrice != null) return false;
        if (midPrice != null ? !midPrice.equals(that.midPrice) : that.midPrice != null) return false;
        if (largePrice != null ? !largePrice.equals(that.largePrice) : that.largePrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolId;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (schoolCity != null ? schoolCity.hashCode() : 0);
        result = 31 * result + (smallPrice != null ? smallPrice.hashCode() : 0);
        result = 31 * result + (midPrice != null ? midPrice.hashCode() : 0);
        result = 31 * result + (largePrice != null ? largePrice.hashCode() : 0);
        return result;
    }
}
