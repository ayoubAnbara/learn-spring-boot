package com.anbara.learnspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * @author Ayoub ANBARA
 */
@ConfigurationProperties("app.config")
@Validated
public record AppConfig(

        /*@NotNull
        @Valid
        AWS aws
        ) {



    public record AWS(
            @NotBlank String accessKeyId,
            @NotBlank String secretKey,
            @NotBlank String endpointSQS) {
    }*/


){

}
