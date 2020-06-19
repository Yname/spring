package com.y.demo;

import com.y.demo.config.FilterConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new FilterConfig());
//        registrationBean.addUrlPatterns("/Equip/queryById");
//        registrationBean.addUrlPatterns("/Equip/equip_l");
//        registrationBean.addUrlPatterns("/Equip/update");
//        registrationBean.addUrlPatterns("/Equip/delete");
//        registrationBean.addUrlPatterns("/Equip/l_equip");
//        registrationBean.addUrlPatterns("/Equip/queryAll");
//        registrationBean.addUrlPatterns("/User/login/*");
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }



}
