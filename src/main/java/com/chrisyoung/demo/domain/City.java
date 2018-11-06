package com.chrisyoung.demo.domain;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:18
 * @description: 城市数据实体
 **/


public class City {
    private long id;
    private long provinceId;
    private String cityName;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
