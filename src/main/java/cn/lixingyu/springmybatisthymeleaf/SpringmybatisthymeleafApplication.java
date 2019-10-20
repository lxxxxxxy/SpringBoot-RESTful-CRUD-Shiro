package cn.lixingyu.springmybatisthymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("cn.lixingyu.springmybatisthymeleaf.dao")
@EnableCaching
public class SpringmybatisthymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatisthymeleafApplication.class, args);
    }

}
