package co.com.udem.inmobiliariaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import co.com.udem.inmobiliariaclient.entities.UserToken;

@SpringBootApplication
public class InmobiliariaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmobiliariaclientApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	UserToken userToken() {
		return new UserToken();
	}
}
