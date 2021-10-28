package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;

@SpringBootApplication // 내장 tomcat 실행
@ComponentScan(basePackageClasses = EmpMybatisController.class)
@ComponentScan
@MapperScan(basePackageClasses = EmpDAO.class)
@MapperScan
public class KdigitalJinApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdigitalJinApplication.class, args);
	}

}
