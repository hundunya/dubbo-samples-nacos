package cn.duck.dubbo.samples.nacos.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 滴滴鸭
 **/
@Data
public class User implements Serializable {
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 年龄
     */
    private int age;
}
