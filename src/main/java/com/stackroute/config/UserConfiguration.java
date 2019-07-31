package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**Configuration annotation indicates that the class has @Bean definition methods*/
@Configuration
/**To enable spring mvc*/
@EnableWebMvc
/**To detect Spring managed components.*/
@ComponentScan(basePackages = "com.stackroute")
public class UserConfiguration {

    /**Creating Bean*/
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
