package com.example.backendfamily.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;

import java.util.Collections;

@Controller
@EnableWebSecurity
 public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /*@Bean
    UserDetailsService users ()
    {
        return new InMemoryUserDetailsManager(Collections.singleton(User.withUsername("cissoko").roles("ADMIN").password("").build()));
    }
*/
    @Bean
    public PasswordEncoder passwordEncoder() {
        PasswordEncoder encoder = new StandardPasswordEncoder();
        return encoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }
}
