package com.example.sesia2.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("jwt")
@Getter
@Setter
public class JwtProperties {
    private String secret;
    private int expiresAt;
}