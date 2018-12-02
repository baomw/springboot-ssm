package com.baomw.ssm.service;

import com.baomw.ssm.domain.City;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 * 服务接口
 *
 * @author baomw
 * @create 2018-12-02 上午 6:15
 */
public interface ICityService {
    /**
     * 增
     * @param name
     */
    void save(String name);

    /**
     * 删
     * @param id
     */
    void delete(long id);

    /**
     * 改
     * @param city
     */
    void update(City city);

    /**
     * 查一条记录
     * @param id
     * @return
     */
    City selectOne(String id);

    /**
     * 查多条记录
     * @return
     */
    List<City> selectList();
}
