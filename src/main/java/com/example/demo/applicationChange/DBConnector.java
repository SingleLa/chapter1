package com.example.demo.applicationChange;

/**
 * Created by Administrator on 2018/4/26.
 * 切换环境命令spring.profiles.active=testdb

 */
public interface DBConnector {
    public  void  configure();
}
