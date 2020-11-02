package com.kataer.architect.springioc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
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
public class Teacher implements BeanNameAware, InitializingBean, DisposableBean, BeanPostProcessor {
    private String name;
    private Integer age;

    //BeanPostProcessor
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("############" + bean);
        log.info(">>>>>>>>>>>>postProcessAfterInitialization");
        return bean;
    }

    //BeanPostProcessor
    @Override

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info(">>>>>>>>>>>>postProcessBeforeInitialization");
        return bean;
    }

    //BeanNameAware
    @Override
    public void setBeanName(String name) {
        log.info(">>>>>>>>>>>>name:" + name);
    }

    //InitializingBean/init-method
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>>>>>>>>>>>afterPropertiesSet");
        this.name = "paofu";
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        log.info(">>>>>>>>>>>>destroy");
    }
}
