package com.example.investment_information.investment_information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class InvestmentInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentInformationApplication.class, args);
	}

}
