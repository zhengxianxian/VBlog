package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//组合注解，结合了@Configuration @ComponentScan 以及@EnableAutoConfiguration注解的功能
@EnableScheduling//开启定时任务支持
//自动扫描并执行带有@Scheduled注解的类

public class BlogserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogserverApplication.class, args);
    }
}
