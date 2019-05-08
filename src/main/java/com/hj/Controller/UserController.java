package com.hj.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Author: hj
 * Date: 2019-05-08 14:02
 * Description: @RestController 当前类的所有方法返回值都直接响应给浏览器
 */
@RestController
@RequestMapping(produces = APPLICATION_JSON_UTF8_VALUE)
public class UserController {

    /**
     * @return 将map集合返回给浏览器
     */
    @GetMapping(value = "/hello")
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "hello springboot");
        return map;
    }
}
