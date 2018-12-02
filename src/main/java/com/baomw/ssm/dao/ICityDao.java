package com.baomw.ssm.dao;

import com.baomw.ssm.domain.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述:
 * dao类
 *
 * @author baomw
 * @create 2018-12-01 下午 10:08
 */
@Repository
@Mapper
public interface ICityDao {

    /**
     * 增
     * @param name
     */
    @Insert("insert into city(name) values(#{name})")
    void save(String name);

    /**
     * 删
     * @param id
     */
    @Delete("delete from city where id = #{id}")
    void delete(long id);

    /**
     * 改
     * @param city
     */
    @Update("update city set name = #{name} where id = #{id}")
    void update(City city);

    /**
     * 查一条记录
     * @param id
     * @return
     */
    @Select("select * from city where id = #{id}")
    City selectOne(String id);

    /**
     * 查多条记录
     * @return
     */
    @Select("select * from city")
    List<City> selectList();
}
