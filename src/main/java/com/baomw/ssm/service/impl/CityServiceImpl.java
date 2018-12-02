package com.baomw.ssm.service.impl;

import com.baomw.ssm.dao.ICityDao;
import com.baomw.ssm.domain.City;
import com.baomw.ssm.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * 描述:
 * 实现类
 *
 * @author baomw
 * @create 2018-12-02 上午 6:16
 */
@Service("cityServiceImpl")
@EnableTransactionManagement
public class CityServiceImpl implements ICityService {

    @Autowired
    ICityDao dao;

    @Override
    public void save(String name) {
        dao.save(name);
    }

    @Override
    public void delete(long id) {
        dao.delete(id);
    }

    @Override
    public void update(City city) {
        dao.update(city);
    }

    @Override
    public City selectOne(String id) {
        return dao.selectOne(id);
    }

    @Override
    public List<City> selectList() {
        return dao.selectList();
    }
}
