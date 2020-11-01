package com.kataer.architect.springioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FoodFactory
 * @Description: TODO
 * @Author kataer
 * @Date 2020/11/1 13:48
 * @Version V1.0
 **/
//@Component Configuration注解中包含Component
@Configuration
public class FoodFactory {

    @Bean(name = "food")
    public Food createFood() {
        return new Food();
    }

    public static class Food {

    }
}
