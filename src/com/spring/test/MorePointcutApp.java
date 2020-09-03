package com.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.service.AccountService;
import com.spring.service.MoreAccountService;
import com.spring.service.UserService;
import com.spring.service.UserServiceImpl;
import com.spring.service.subservice.SubUserService;

public class MorePointcutApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = appContext.getBean(UserService.class);
		SubUserService subUserService = appContext.getBean(SubUserService.class);
		
		userService.methodSpecific();
		
		userService.methodWithParam(10, 20, 30);
		userService.methodWithThreeParam(10,  20,  30);
		System.out.println("\nSubpackage ..................................");
		subUserService.subMethodSpecific();
		
		System.out.println("\n\nCHECKING this .......... \n");
		userService.methodSpecific();
		
		
		System.out.println("\n\nCHECKING target .......... \n");		
		AccountService acService = appContext.getBean(AccountService.class);
		System.out.println("Account Service =========" + acService.giveName());
		

		System.out.println("__________________________________________________");
		userService.methodWithParam("a", "b");
		userService.methodWithParam(10, 10);
//
//		
		appContext.close();
	}
}
