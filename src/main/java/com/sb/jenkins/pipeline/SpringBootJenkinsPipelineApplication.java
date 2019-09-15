package com.sb.jenkins.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsPipelineApplication.class, args);
	}

	@GetMapping("/JenkinsPipelineTest")
	public String jenkinsTest()
	{
		return "Welcome to Jenkins Pipeline CI/CD test.";
	}
}
