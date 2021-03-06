package io.github.tesla.ops;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = {"io.github.tesla.persistence", "io.github.tesla.ops"},
    annotationClass = Mapper.class)
@SpringBootApplication
public class TeslaOpslApplication {
  public static void main(String[] args) {
    SpringApplication.run(TeslaOpslApplication.class, args);
  }

}
