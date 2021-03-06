package com.changinye.www.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CenterEurekaApplication {

	private static Logger logger = LoggerFactory.getLogger(CenterEurekaApplication.class);
	private static String name = "Eureka注册中心";

	public static void main(String[] args) {
		SpringApplication.run(CenterEurekaApplication.class, args);
		logger.info("【启动微服务成功】【{}】", name);
	}

}
