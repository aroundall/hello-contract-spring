package org.amuji.hellospringcontract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;

@SpringBootApplication
@EnableStubRunnerServer
//@AutoConfigureStubRunner(ids = "org.amuji:http-server-producer:+:stubs:8095", workOffline = false)
public class HelloSpringContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringContractApplication.class, args);
	}
}
