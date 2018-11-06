package com.chrisyoung.demo.service.impl;

import com.chrisyoung.demo.constant.OperationCode;
import com.chrisyoung.demo.dao.CityDao;
import com.chrisyoung.demo.domain.City;
import com.chrisyoung.demo.dto.DataTransferModel;
import com.chrisyoung.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:19
 * @description: service实现类
 **/

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;



    @Override
    public City findCityByName(String cityName) {

        return cityDao.findByName(cityName);
    }

    @Override
    public int instertCity(City city) {
        return cityDao.insertCity(city);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public int sychronizeCitise(List<DataTransferModel<City>> cities) {
        int result=0;
        if(cities.isEmpty()){
            result=0;
        }else{
            for (DataTransferModel item: cities) {
                if(item.getOptCode()==OperationCode.INSERT){
                    result=cityDao.insertCity((City) item.getData());
                }else if (item.getOptCode()==OperationCode.UPDATE){
                    result=cityDao.updateCity((City) item.getData());
                }else{
                    result=cityDao.delete((int)((City)item.getData()).getId());
                }
            }

        }
        return result;
    }
}
