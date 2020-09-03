package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.service.UserService;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = appContext.getBean(UserService.class);
		
		userService.methodWithParam(2, 3);
		userService.methodWithParam(4, 5);
		
		
//		userService.methodWithParam(10, 20, 30);
//		userService.methodWithThreeParam(10,  20,  30);
//		
//		userService.methodWithParam(10,  20);
//		userService.methodWithParam("Hello", "World");
//		userService.methodWithParam(1.1,  2.2);
//		userService.methodWithTwoParam("Hello", "World");
//		
//		System.out.println("..............................................");
//		userService.methodForAround();
//		userService.methodForAround(10);
//		
//		System.out.println("===============================================");
//		try {
//			userService.methodWithTwoParamThrow(10, 10);
//		} catch (Exception e) {
//			System.out.println("EXCEPTION THROWN............\n");
//		}
//		
//		try {
//			userService.methodWithTwoParamThrow("Hello", "World");
//		} catch (Exception e) {
//			System.out.println("ONE MORE EXCEPTION THROWN............\n");
//		}
		
		appContext.close();
	}
}
