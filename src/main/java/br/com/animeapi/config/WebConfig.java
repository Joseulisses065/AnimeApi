package br.com.animeapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${cors.originPatterns:default}")
    private String cors;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        var allowedOrigins = cors.split(",");
        registry.addMapping("/**")
                //  .allowedMethods("GET","POST","PUT","DELETE")
                .allowedMethods("*")
                .allowedOrigins(allowedOrigins);
    }
}
