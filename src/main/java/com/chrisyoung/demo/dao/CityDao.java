package com.chrisyoung.demo.dao;

import com.chrisyoung.demo.domain.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: demo
 * @author: Chris Young
 * @create: 2018-11-05 20:16
 * @description: 城市数据库操作接口
 **/
@Mapper
@Repository
public interface CityDao {
    @Select("select * from city where city_name=#{cityName}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "provinceId",column = "province_id"),
            @Result(property = "cityName",column = "city_name"),
            @Result(property = "description",column = "description"),
    })
    City findByName(@Param("cityName") String cityName);

    @Select("select * from city")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "provinceId",column = "province_id"),
            @Result(property = "cityName",column = "city_name"),
            @Result(property = "description",column = "description"),
    })
    List<City> findAllCity();

    @Insert("insert into city(id,province_id,city_name,description) values(#{id},#{provinceId},#{cityName},#{description})")
    int insertCity(City city);

    @Update("update city set province_id=#{provinceId},city_name=#{cityName},description=#{description} where id=#{id}")
    int updateCity(City city);

    @Delete("delete from city where id=#{id}")
    int delete(@Param("id") int id);
}
