package com.afuentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.afuentes.interceptors.RequestInterceptor;

@Configuration
public class MultilingualBlogSpringBootExampleConfiguration extends WebMvcConfigurerAdapter{
	
	@Autowired
	private RequestInterceptor requestInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(this.requestInterceptor);
	}

}
