package br.com.impacta.ibpf.lancamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IbpfLancamentosApplication {

	public static void main(String[] args) {

		SpringApplication.run(IbpfLancamentosApplication.class, args);
	}

}
