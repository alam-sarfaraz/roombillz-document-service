package com.inn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableAspectJAutoProxy
//@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	    info = @Info(
	        title = "RoomBillz Document Service",
	        version = "v1",
	        description = "Microservice for managing document generation, storage, and retrieval within the RoomBillz platform.",
	        contact = @Contact(
	            name = "Sarfaraz Alam",
	            email = "sarfarazalam2702@gmail.com",
	            url = "https://www.linkedin.com/in/alam-sarfaraz/"
	        ),
	        license = @License(
	            name = "Apache 2.0",
	            url = "http://www.apache.org/licenses/LICENSE-2.0.html"
	        )
	    ),
	    servers = {
	        @Server(
	            url = "http://localhost:8084/api/v1/document",
	            description = "Local Document Service Server"
	        ),
	        @Server(
		            url = "https://qa/api.roombillz.com/api/v1/document",
		            description = "QA Server"
		        ),
	        @Server(
	            url = "https://api.roombillz.com/api/v1/document",
	            description = "Production Server"
	        )
	    },
	    externalDocs = @ExternalDocumentation(
	        description = "RoomBillz Document API Documentation",
	        url = "https://roombillz.com/docs/notification"
	    )
	)
public class RoombillzDocumentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoombillzDocumentServiceApplication.class, args);
		System.out.println("************************************************** RoomBillz Document Service Started Successfully ************************************************************");
	}

}
