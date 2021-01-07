/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.jeesite.common.io.PropertiesUtils;

/**
 * JeeSite Web
 * @author ThinkGem
 * @version 2018-1-8
 */
@SpringBootApplication(scanBasePackages={"com.jeesite.modules","com.zebone"})
@EntityScan(basePackages = {"com.zebone"})
@MapperScan("com.zebone.quality.modules")
public class Application extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.setDefaultProperties(PropertiesUtils.getInstance().getProperties());
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		this.setRegisterErrorPageFilter(false); // 错误页面有容器来处理，而不是SpringBoot
		builder.properties(PropertiesUtils.getInstance().getProperties());
		return builder.sources(Application.class);
	}
	
}