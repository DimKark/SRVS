package com.dimandco.srvs.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(new Info()
                .title("SRV Service")
                .version("v1")
                .description("SRVS (Study Rooms Validation Service) REst API")
        );
    }

    @Bean
    public GroupedOpenApi apiGroup() {
        return GroupedOpenApi.builder()
                .group("api")
                .packagesToScan("com.dimandco.srvs.web.rest")
                .pathsToMatch("/api/v1/**")
                .build();
    }
}
