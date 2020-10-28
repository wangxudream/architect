package com.kataer.architect.redis.seckill.config;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author
 * @description MyBatisPlus自定义字段自动填充处理类 - 实体类中使用 @TableField注解
 * @date 2019/11/07
 */

//@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * @Description: 插入时自动填充
     * @return: java.lang.String
     * @Author:
     */
    @Override
    public void insertFill(MetaObject metaObject) {
//        setFieldValByName("execTime", new Date(), metaObject);
//        setFieldValByName("dlsj", new Date(), metaObject);
//        setFieldValByName("lrr", getLoginUserName(), metaObject);
//        setFieldValByName("lrrq", new Date(), metaObject);
//        setFieldValByName("xgr", getLoginUserName(), metaObject);
//        setFieldValByName("xgrq", new Date(), metaObject);
    }

    /**
     * @Description: 更新时自动填充
     * @return: java.lang.String
     * @Author:
     */
    @Override
    public void updateFill(MetaObject metaObject) {
//        setFieldValByName("xgr", getLoginUserName(), metaObject);
//        setFieldValByName("xgrq", new Date(), metaObject);
    }

}
