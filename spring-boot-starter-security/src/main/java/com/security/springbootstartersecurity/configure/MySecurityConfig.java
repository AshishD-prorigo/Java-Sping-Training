package com.security.springbootstartersecurity.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http	
				.csrf().disable() ///to add data when you are Admin first disable csrf
				.authorizeRequests()
				.antMatchers("/users/**").hasRole("ADMIN")
				.antMatchers("/public/**").hasRole("NORMAL") //("/public/**") URL start after public will get access
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
		
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Ashish").password(this.passwordEncoder().encode("1234")).roles("NORMAL");
		auth.inMemoryAuthentication().withUser("ajay").password(this.passwordEncoder().encode("ajay1234")).roles("ADMIN");
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new  BCryptPasswordEncoder(10);
	}

	
	
}
