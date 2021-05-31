/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.config;

import com.zebone.common.utils.SpringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.jeesite.common.io.PropertiesUtils;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

/**
 * JeeSite Web
 * @author ThinkGem
 * @version 2018-1-8
 */
@SpringBootApplication(scanBasePackages={"com.jeesite.modules","com.zebone"})
@EntityScan(basePackages = {"com.zebone"})
@MapperScan("com.zebone")
@EnableJpaAuditing
@EnableScheduling
@EnableJpaRepositories(basePackages = {"com.zebone"})
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(PropertiesUtils.getInstance().getProperties());
		app.setBannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext context = app.run(args);
		SpringUtils.setApplicationContext(context);

	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
		builder.properties(PropertiesUtils.getInstance().getProperties());
		return builder.sources(Application.class);
	}


	
}