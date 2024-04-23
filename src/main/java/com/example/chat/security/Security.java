package com.example.chat.security;

import com.example.chat.service.UserDetailsServImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Security {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/admin").hasRole("ADMIN")
                        .requestMatchers("/registration").permitAll()
                        .anyRequest().permitAll()
                )

                .httpBasic(Customizer.withDefaults())
                .formLogin(form -> form
                        .loginPage("/logform")
                        .loginProcessingUrl("/login")
                        .permitAll());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetailsServImpl();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
}

