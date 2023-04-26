package com.password.password;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasswordCrudApplication.class, args);
	}
public ModelMapper modelMapper(){
		return new ModelMapper();
}

}
