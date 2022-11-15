package br.edu.infnet.appcurriculumvitae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppcurriculumvitaeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppcurriculumvitaeApplication.class, args);
	}

}
