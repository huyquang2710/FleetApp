package com.hquang.AppSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication /* (exclude = { SecurityAutoConfiguration.class }) */
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AppSpringApplication {
	
	@Bean
	public AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppSpringApplication.class, args);
	}

}
