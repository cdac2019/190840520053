package com.JDBC.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDaoApplication implements CommandLineRunner {

	 @Autowired
	 private UserDao userdao;
	public static void main(String[] args) {
		System.out.println("by");
		SpringApplication.run(JdbcDaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		//this.userdao.creatuser();
		//this.userdao.updateuser();
		this.userdao.readuser();
		//this.userdao.readoneuser();
		
	}
	

}
