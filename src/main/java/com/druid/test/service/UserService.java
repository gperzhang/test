package com.druid.test.service;

import com.druid.test.domain.UserDO;

/**
 * @author acai
 * @Date 2021/3/17
 */
public interface UserService {
    UserDO selectById(Long id);
}
