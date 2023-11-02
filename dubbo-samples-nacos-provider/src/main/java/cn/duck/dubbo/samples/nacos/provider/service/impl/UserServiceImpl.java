package cn.duck.dubbo.samples.nacos.provider.service.impl;

import cn.duck.dubbo.samples.nacos.model.User;
import cn.duck.dubbo.samples.nacos.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 滴滴鸭
 **/
@DubboService
public class UserServiceImpl implements UserService {
    @Resource
    RedisTemplate<String, User> redisTemplate;

    @Override
    public User getUser(String nickname) {
        User user = redisTemplate.opsForValue().get(nickname);
        System.out.println("==============================");
        System.out.println("获取用户信息："+user);
        System.out.println("==============================");
        return user;
    }

    @Override
    public void setUser(User user) {
        System.out.println("==============================");
        System.out.println("设置用户信息："+user);
        System.out.println("==============================");
        String key = user.getNickname();
        final int fiveMinutes = 5 * 60 * 1000;
        redisTemplate.opsForValue().set(key, user, fiveMinutes, TimeUnit.SECONDS);
    }
}
