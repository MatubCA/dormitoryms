package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southwind.mapper")
public class DormitorymsSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DormitorymsSpringbootApplication.class, args);
        System.out.println("项目启动成功！( •̀ ω •́ )✧");
    }

}
