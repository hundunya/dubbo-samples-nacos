package cn.duck.dubbo.samples.nacos.consumer.controller;

import cn.duck.dubbo.samples.nacos.model.User;
import cn.duck.dubbo.samples.nacos.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 滴滴鸭
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference
    UserService userService;

    @GetMapping("/set")
    public String setUser(String nickname, int age){
        User user = new User();
        user.setNickname(nickname);
        user.setAge(age);
        userService.setUser(user);
        return "更新用户信息成功";
    }

    @GetMapping("/get")
    public User getUser(String nickname){
        return userService.getUser(nickname);
    }

}
