package com.bidi.springguru.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bidi.springguru")
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}

}
