package com.afuentes;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class MultilingualBlogSpringBootExampleApplication {
	
	@Bean
	public MessageSource messageSource() {
	    final ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasenames("classpath:/i18/labels");
	    return messageSource;
	}
	
	@Bean(name = "localeResolver")
    public SessionLocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
	    sessionLocaleResolver.setDefaultLocale(new Locale("en", "EN"));
	    return sessionLocaleResolver;
    }

	public static void main(String[] args) {
		SpringApplication.run(MultilingualBlogSpringBootExampleApplication.class, args);
	}
}
