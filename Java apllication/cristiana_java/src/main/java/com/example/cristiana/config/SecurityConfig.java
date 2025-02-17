package com.example.cristiana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.ignoringRequestMatchers("/rezervari/delete/**"))
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login", "/resources/**").permitAll() // Permite accesul la pagina de login și resurse statice
                        .anyRequest().authenticated() // Toate celelalte cereri necesită autentificare
                )
                .formLogin(form -> form
                        .loginPage("/login") // Pagina personalizată de login
                        .defaultSuccessUrl("/", true) // Redirecționează după autentificare
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout") // Redirecționează după delogare
                        .permitAll()
                );

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // Fără criptare: folosește parolele exact așa cum sunt stocate în baza de date
        return org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance();
    }
}
