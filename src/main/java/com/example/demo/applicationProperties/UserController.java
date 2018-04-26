package com.example.demo.applicationProperties;

import com.example.demo.applicationProperties.model.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/26.
 * 获取application.properties中的属性
 */
@RestController
public class UserController {

    @Value("${com.dudu.name}")
    private  String name;
    @Value("${com.dudu.want}")
    private  String want;

    @RequestMapping("/hexo")
    public String hexo(){
        return name+","+want;
    }
    @Autowired
    ConfigTestBean configTestBean;
    @RequestMapping("/hexo2")
    public String hexo2(){
        return configTestBean.getName();
    }
}
