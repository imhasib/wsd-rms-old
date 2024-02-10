package com.hsb.rms.config;

import com.hsb.rms.domain.CustomAuditorAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        // Assuming you have a custom implementation of AuditorAware to retrieve the current user
        return new CustomAuditorAware();
    }
}
