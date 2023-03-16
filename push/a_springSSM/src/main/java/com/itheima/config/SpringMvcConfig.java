package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: 哈拉少本少
 * @Date: 2023/03/16/18:33
 * @Description:
 */
@Configuration
@ComponentScan({"com.itheima.controller","com.itheima.config"})
//开启json转换器
@EnableWebMvc
public class SpringMvcConfig {
}
