package com.druid.test.controller;

import com.druid.test.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author acai
 * @Date 2021/3/17
 */
@RestController
@RequestMapping("/byai/crm")
public class BatchQueryController {

    @Resource
    private UserService userService;

    @GetMapping("/test")
    public void test(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            executorService.execute(()->userService.selectById(1L));
        }
    }
}
