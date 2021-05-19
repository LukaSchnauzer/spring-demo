package com.accenture.springacademy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    protected void configure( HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests().antMatchers("*").denyAll();
        httpSecurity.formLogin().and().authorizeRequests().antMatchers("/h2/**").authenticated();
        httpSecurity.formLogin().and().authorizeRequests().antMatchers("/index**").authenticated();
        httpSecurity.formLogin().and().authorizeRequests().antMatchers("/addProducts**").authenticated();

        //httpSecurity.authorizeRequests().antMatchers("/h2/**").permitAll();
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }
}
