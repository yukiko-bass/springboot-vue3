package jp.bass.springboot.vue.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Component
public class SpaPageResourceResolver extends PathResourceResolver {

    @Override
    public Resource getResource(String resourcePath, Resource location) throws IOException {
        Resource resource = super.getResource(resourcePath, location);
        return (resource != null) ? resource : super.getResource("index.html", location);
    }
}
