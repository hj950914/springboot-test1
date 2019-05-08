package com.hj.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author: hj
 * Date: 2019-05-08 14:57
 * Description: 通过加载配置文件,为当前类中的属性注入值
 */
@Component//必须将当前类添加到容器中
//@PropertySource({"classpath:xxx"})加载外部的属性文件
@ConfigurationProperties(prefix = "user")//将当前类中所有的属性与配置文件中的user进行绑定
@Data
public class User {

    private String username;

    private Integer age;

    private Boolean status;

    private Date birthday;

    private Address address;

    private List<String> list;

    private Map<String, Object> map;
}
