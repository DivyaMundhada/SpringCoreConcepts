/**
 * UC1 : Create a Project to learn Spring Concepts
 *
 * @author : DIVYA MUNDHADA
 * @since : 09.08.2021
 */
package com.bridgelabz.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Welcome to Spring Concept");
		System.out.println("Checking Context: " + context.getBean(DemoBean.class));
	}
}