package rogger.guia.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //para el consumo de la api externa
@SpringBootApplication
public class SpringMicroAulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroAulaApplication.class, args);
	}

}
