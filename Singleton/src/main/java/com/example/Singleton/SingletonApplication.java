package com.example.Singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Singleton.SingleConnection;

import java.sql.Connection;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		Connection data= SingleConnection.getConnection();
		System.out.println(data);

	}

}
