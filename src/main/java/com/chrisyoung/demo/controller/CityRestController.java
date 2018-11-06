package com.chrisyoung.demo.controller;

import com.chrisyoung.demo.domain.City;
import com.chrisyoung.demo.dto.DataTransferModel;
import com.chrisyoung.demo.service.impl.CityServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:17
 * @description: Api
 **/

@RestController
@RequestMapping("/api")
public class CityRestController {

    @Autowired
    private CityServiceImpl cityService;


    @ApiOperation(value = "根据城市名称查找城市")
    @RequestMapping(value = "/city",method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName",required = true) String cityName){
        return cityService.findCityByName(cityName);
    }

    @ApiOperation(value = "添加城市",notes = "根据City对象添加城市")
    @ApiImplicitParam(name = "city",value = "city对象",required = true,dataType = "City")
    @RequestMapping(value = "/addCity",method = RequestMethod.PUT)
    public int addOneCity(@RequestBody City city){
        return cityService.instertCity(city);
    }

    @ApiOperation(value = "查找所有城市")
    @RequestMapping("/cities")
    public List<City> findCities(){
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/sychronizeCities",method = RequestMethod.PUT)
    public int sychronizeCities(@RequestBody List<DataTransferModel<City>> cities){
        return cityService.sychronizeCitise(cities);
    }
}
