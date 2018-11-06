package com.chrisyoung.demo.service;

import com.chrisyoung.demo.domain.City;
import com.chrisyoung.demo.dto.DataTransferModel;

import java.util.List;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:19
 * @description: service接口
 **/

public interface CityService {
    City findCityByName(String cityName);
    int instertCity(City city);
    List<City> findAllCity();
    int sychronizeCitise(List<DataTransferModel<City>> cities);
}
