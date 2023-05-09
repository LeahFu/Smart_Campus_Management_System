package ca.access.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Lei Fu
 * @date: 2023/05/09
 * @description: Configurer
 */
public class ConfigurerAdapter implements WebMvcConfigurer {
    /**
     * Configure cross-domain
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Which request paths are processed cross-domain
        registry.addMapping("/**")
           // Allowed request headers, all request headers are allowed by default
                .allowedHeaders("*")
           // Allowed method
                .allowedMethods("*")
           // Probe request valid time, in seconds
                .maxAge(1800)
           // Whether to allow cookies
                .allowCredentials(true)
           // Supported domains
                .allowedOriginPatterns("*");
    }
}
