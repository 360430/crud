package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/18:32
 * @Description:
 */
@Configuration
@ComponentScan({"com.itheima.service","com.itheima.dao"})
@Import({JdbcConfig.class,MybatisConfig.class})
//开启事务管理器
@EnableTransactionManagement
public class SpringConfig {
}
