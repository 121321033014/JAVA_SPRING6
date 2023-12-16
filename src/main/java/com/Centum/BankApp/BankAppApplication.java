package com.Centum.BankApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//open pom.xml file and enter which is used to access the Swagger page
//<dependency>
//      <groupId>org.springdoc</groupId>
//      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
//      <version>2.0.0</version>
//   </dependency>
//open application.properties and write
//server.port=9092
//spring.datasource.url=jdbc:h2:mem:testdb
//spring.datasource.driverClassName=org.h2.Driver
//spring.datasource.username=sa
//spring.datasource.password=password
//spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
@SpringBootApplication
public class BankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppApplication.class, args);
	}

}
