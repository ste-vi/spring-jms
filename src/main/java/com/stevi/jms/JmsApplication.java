package com.stevi.jms;

import com.stevi.jms.producer.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JmsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JmsApplication.class, args);
		Producer producer = applicationContext.getBean(Producer.class);
		producer.produce();
	}

}
