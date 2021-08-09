/**
 * UC2 : Added Logger to Log Messages.
 *
 * @author : DIVYA MUNDHADA
 * @since : 09.08.2021
 */

package com.bridgelabz.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Welcome to Spring Concept");
		logger.debug("Checking Context: {}" + context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
	}
}
