package com.kataer.architect.springioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author kataer
 * @Date 2020/11/1 20:59
 * @Version V1.0
 **/
@Slf4j
@Component
public class Teacher implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>>>>>>>>postProcessAfterInitialization");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>>>>>>>>postProcessBeforeInitialization");
        return bean;
    }
}
