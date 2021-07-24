package com.druid.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author acai
 * @Date 2021/3/17
 */
@Component
public class BeanHolders implements ApplicationContextAware {

    public ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    public  <T> T getBean(String name){
        return (T) applicationContext.getBean(name);
    }
}
