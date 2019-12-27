package com.examplemybatis.demo.service;

import com.examplemybatis.demo.dao.CarMapper;
import com.examplemybatis.demo.entity.Car;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Query {

    @Autowired
    CarMapper carMapper;

    @Test
    public void test(){
        Car car = carMapper.selectByPrimaryKey(1L);
        System.out.println(car.getId());
    }
}
