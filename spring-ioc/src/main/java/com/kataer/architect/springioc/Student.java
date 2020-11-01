package com.kataer.architect.springioc;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName Student
 * @Description: TODO
 * @Author kataer
 * @Date 2020/11/1 13:40
 * @Version V1.0
 **/
@Data
@Component
public class Student {
    private String name = "小明";
    private Integer age = 25;
}
