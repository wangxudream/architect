package com.kataer.architect.redis.seckill.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Info
 * @Description: TODO
 * @Author kataer
 * @Date 2020/10/28 14:30
 * @Version V1.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Info implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String userName;
    private Date time;
}
