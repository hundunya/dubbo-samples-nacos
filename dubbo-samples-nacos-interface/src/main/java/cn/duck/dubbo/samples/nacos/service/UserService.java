package cn.duck.dubbo.samples.nacos.service;

import cn.duck.dubbo.samples.nacos.model.User;

/**
 * @author 滴滴鸭
 *
 * 用户服务接口定义
 **/
public interface UserService {
    /**
     * 获取用户信息
     * @param nickname 昵称
     * @return 用户信息
     */
    User getUser(String nickname);

    /**
     * 设置用户信息
     * @param user 用户信息
     */
    void setUser(User user);
}
