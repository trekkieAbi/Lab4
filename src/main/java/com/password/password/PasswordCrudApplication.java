package com.password.password;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.password.password.AES.AESExample;

@SpringBootApplication
public class PasswordCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PasswordCrudApplication.class, args);
	}
	@Bean
public ModelMapper modelMapper(){
		return new ModelMapper();
}
	@Override
	public void run(String... args) throws Exception {
System.out.println(AESExample.decrypt("vFLBVfi3lwrjmO4DhSA9Bg=="));		
	}
	
	

}
