package dev.stella.appi_ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dev.stella.controllers", "dev.stella.persistence"})
public class AppiTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppiTicketApplication.class, args);
	}

}
