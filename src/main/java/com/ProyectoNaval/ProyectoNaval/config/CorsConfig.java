// WebConfig.java - Configuración global de CORS
package com.ProyectoNaval.ProyectoNaval.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000", "https://proyecto-naval-frontend.vercel.app/", "http://localhost:3001") // URL de tu frontend
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
