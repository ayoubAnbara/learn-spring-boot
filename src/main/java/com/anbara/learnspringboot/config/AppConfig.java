package com.anbara.learnspringboot.config;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.util.List;

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
            @NotBlank String region) {
    }




}
