package com.construBem.Api_construBem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration 
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean 
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
            .authorizeHttpRequests(auth -> auth
                //Liberar o acesso ao console do h2
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()

    
            )
            // Desabilita CSRF para o h2 (necessário para o console funcionar)
            .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**")) 
            //Permitie que o h2 use iframes
            .headers(headers -> headers.frameOptions(frame -> frame.sameOrigin()));


            return http.build();
    }

    
}
