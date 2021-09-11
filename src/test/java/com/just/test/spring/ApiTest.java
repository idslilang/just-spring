package com.just.test.spring;

import com.just.spring.springframework.beans.factory.config.BeanDefinition;
import com.just.spring.springframework.beans.factory.BeanFactory;

/**
 * @description:
 * @author: lilang
 * @version:
 * @modified By:1170370113@qq.com
 */
public class ApiTest {

    public void testBeanFactory(){

        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());

        beanFactory.registBeanDefinition("userservice",beanDefinition);

        BeanFactory

    }
}
