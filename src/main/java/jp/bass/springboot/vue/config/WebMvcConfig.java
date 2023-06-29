package jp.bass.springboot.vue.config;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final WebProperties webProperties;
    private final SpaPageResourceResolver spaPageResourceResolver;

    public WebMvcConfig(WebProperties webProperties, SpaPageResourceResolver spaPageResourceResolver) {
        this.webProperties = webProperties;
        this.spaPageResourceResolver = spaPageResourceResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations(webProperties.getResources().getStaticLocations())
                .resourceChain(webProperties.getResources().getChain().isCache())
                .addResolver(spaPageResourceResolver);
    }
}
