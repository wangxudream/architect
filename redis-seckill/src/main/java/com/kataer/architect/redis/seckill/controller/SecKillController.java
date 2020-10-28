package com.kataer.architect.redis.seckill.controller;

import com.kataer.architect.redis.seckill.entity.Info;
import com.kataer.architect.redis.seckill.entity.JsonResult;
import com.kataer.architect.redis.seckill.service.InfoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName SecKillController
 * @Description: TODO
 * @Author kataer
 * @Date 2020/10/28 18:06
 * @Version V1.0
 **/
@Slf4j
@Controller
@RequestMapping("/seckill")
public class SecKillController {
    private static final String KEY = "seckillkey";
    private static volatile boolean hasGoods = true;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private InfoServiceImpl infoService;

    @GetMapping
    @ResponseBody

    public JsonResult secKill(String userName) {
        if (hasGoods) {
            long afterDec = redisTemplate.opsForValue().decrement(KEY);
            if (afterDec >= 0) {
                //将库存标识为空
                if (afterDec == 0) {
                    hasGoods = false;
                }
                //订单消息存入数据库
                //todo 考虑商品数量很多时数据库的效率
                try {
                    Info info = Info.builder().userName(userName).time(new Date()).build();
                    if (infoService.save(info)) {
                        return JsonResult.ok(200, "抢购成功");
                    }
                } catch (Exception e) {
                    //保存数据失败
                    log.error(e.getMessage());
                    redisTemplate.opsForValue().increment(KEY);
                    hasGoods = true;
                    return JsonResult.error(404, "抢购失败");
                }
            }
        }
        return JsonResult.error(405, "商品已售完");
    }
}
