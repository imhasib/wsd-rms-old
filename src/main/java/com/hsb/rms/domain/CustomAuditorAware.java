package com.hsb.rms.domain;


import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class CustomAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Logic to retrieve the current user's information (username or ID) from Spring Security context
        // For example, you might retrieve it from SecurityContextHolder or other Spring Security mechanisms
        // Replace "currentUser" with the actual method to retrieve the current user's information
        String currentUser = "System"; // Example username

        return Optional.of(currentUser);
    }
}
