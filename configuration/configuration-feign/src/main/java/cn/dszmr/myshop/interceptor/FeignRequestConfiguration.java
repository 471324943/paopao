package cn.dszmr.myshop.interceptor;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignRequestConfiguration {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return new FeignRequestInterceptor();
    }
}