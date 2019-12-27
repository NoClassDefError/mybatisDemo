package com.examplemybatis.demo.Controller;

import com.examplemybatis.demo.dao.CarMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    @Autowired
    CarMapper mapper;

    @RequestMapping("/test")
    public String query(){
        return mapper.selectByPrimaryKey(1L).toString();
    }
}
