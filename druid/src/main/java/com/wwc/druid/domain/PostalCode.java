package com.wwc.druid.domain;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="prac_postalcode")
public class PostalCode implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    public int id;
    @Column(name = "CityId")
    public String cityId;
    @Column(name = "CityName_Sub")
    public String cityNameSub;
    @Column(name = "CityName")
    public String cityName;
    @Column(name = "PostalCode")
    public String postalCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityNameSub() {
        return cityNameSub;
    }

    public void setCityNameSub(String cityNameSub) {
        this.cityNameSub = cityNameSub;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
