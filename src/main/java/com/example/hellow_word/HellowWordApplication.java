package com.example.hellow_word;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan({"com.example.hellow_word.mapper" , "com.example.hellow_word.service.impl"})
public class HellowWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellowWordApplication.class, args);
    }
    @Bean
    public Interceptor[] plugins() {
        return new Interceptor[]{new PageInterceptor()};
    }
}
