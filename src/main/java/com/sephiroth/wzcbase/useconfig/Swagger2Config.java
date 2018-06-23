package com.sephiroth.wzcbase.useconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * 摘要信息 docket
     * @return
     */
    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("标题：sephiroth-demo-接口文档")
                        .description("描述： 用于vuetify-base系统对接联调")
                        .contact(new Contact("吴占超","https://github.com/sephirothwzc","zhanchao.wu@icloud.com"))
                        .version("版本号：BATE 1.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sephiroth.wzcbase.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
