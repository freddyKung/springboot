package com.incrte.springboot.ch01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch01Application {
// 最基本的啟動類
    public static void main(String[] args) {
        SpringApplication.run(Ch01Application.class, args);

//        SpringApplication springApplication = new SpringApplication(Demo1Application.class);
//        springApplication.run(args);
    }

}
