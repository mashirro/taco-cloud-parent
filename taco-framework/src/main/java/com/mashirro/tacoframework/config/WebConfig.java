package com.mashirro.tacoframework.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 在Spring Boot应用程序中使用带有@CrossOrigin注释的控制器方法CORS配置不需要任何特定的配置。
 * 可以通过使用定制的addCorsMappings（CorsRegistry）方法注册WebMvcConfigurer bean来定义全局CORS配置。
 */
@Configuration
public class WebConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {

            /**
             * 定义全局CORS配置
             * @param registry
             */
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                        .allowedHeaders("*");
            }
        };
    }
}
