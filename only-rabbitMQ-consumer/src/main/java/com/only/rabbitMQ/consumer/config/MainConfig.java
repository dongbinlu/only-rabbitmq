package com.only.rabbitMQ.consumer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.only.rabbitMQ.consumer"})
@EnableTransactionManagement
@EnableAsync
@EnableAspectJAutoProxy
@EnableScheduling
@MapperScan(value = "com.only.rabbitMQ.consumer.mapper")
public class MainConfig {
}
