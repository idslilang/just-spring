package com.just.spring.springframework.factory;


import com.just.spring.springframework.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
