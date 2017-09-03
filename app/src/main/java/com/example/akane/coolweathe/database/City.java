package com.example.akane.coolweathe.database;

import org.litepal.crud.DataSupport;

/**
 * Created by akane on 2017/9/2.
 */

public class City extends DataSupport{
    private int id;
    private int cityName;
    private int cityCode;
    private int provinceId;



    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityName() {
        return cityName;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
