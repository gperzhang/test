package com.druid.test.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSONObject;
import com.druid.test.BeanHolders;
import com.druid.test.domain.UserDO;
import com.druid.test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acai
 * @Date 2021/3/17
 */
@RestController
@RequestMapping("/byai/crm")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private BeanHolders beanHolders;

    @GetMapping("/selectOne")
    public UserDO selectOne(Long id){
        return userService.selectById(id);
    }

    @GetMapping("/druid")
    public String druid(){
        DruidDataSource bean = beanHolders.getBean("dataSource");
        bean.getConnectCount();
        JSONObject json = new JSONObject();
        json.put("连接数",bean.getConnectCount());
        json.put("激活数",bean.getActiveCount());
        return json.toJSONString();
    }

}
