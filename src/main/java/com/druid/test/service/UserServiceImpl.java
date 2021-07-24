package com.druid.test.service;

import com.alibaba.druid.pool.DruidDataSource;
import com.druid.test.domain.UserDO;
import com.druid.test.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author acai
 * @Date 2021/3/17
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Override
    public UserDO selectById(Long id) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userMapper.selectById(id);
    }


}
