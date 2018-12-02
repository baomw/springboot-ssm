package com.baomw.ssm.controller;

import com.baomw.ssm.domain.City;
import com.baomw.ssm.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述:
 * 控制类
 *
 * @author baomw
 * @create 2018-12-02 上午 6:20
 */
@RestController
@RequestMapping("/ssm")
public class CityController {

    @Autowired
    ICityService service;

    @RequestMapping("/save")
    public String save(String name) {
        service.save(name);
        return "save successed";
    }

    @RequestMapping("/delete")
    public String delete(long id) {
        service.delete(id);
        return "delete successed";
    }

    @RequestMapping("/update")
    public String update(City city) {
        service.update(city);
        return "update successed";
    }

    @RequestMapping("/selectOne")
    public City selectOne(String id) {
        return service.selectOne(id);
    }

    @RequestMapping("/selectList")
    public List<City> selectList() {
        return service.selectList();
    }
}
