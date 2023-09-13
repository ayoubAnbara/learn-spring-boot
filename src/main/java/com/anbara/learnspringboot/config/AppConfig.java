package com.anbara.learnspringboot.config;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

/**
 * @author Ayoub ANBARA
 */
@ConfigurationProperties("app.config")
@Validated
public record AppConfig(

        @NotNull
        @Valid
        AWS aws
        ) {



    public record AWS(
            @NotBlank String accessKeyId,
            @NotBlank String secretKey,
            @NotBlank String endpointSQS) {
    }




}
