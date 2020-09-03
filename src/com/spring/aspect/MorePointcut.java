package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MorePointcut {
//	@Before("within(com.spring.service.*)")
//	public void anyMethodInPackage(JoinPoint jp) {
//		System.out.println("\nwithin....... Any JoinPoint in the package ....");
//	}
//
//	@Before("within(com.spring.service..*)")
//	public void anyMethodInSubPackage(JoinPoint jp) {
//		System.out.println("\nwithin....... Any JoinPoint in the package and subpackage....");
//	}
//
//	@Before("args(java.lang.String, java.lang.String)")
//	public void methodStringParam(JoinPoint jp) {
//		System.out.println("Method having two String parameter  __________________");
//	}
//
	
	
	
	
	// @Before("this(com.spring.service.UserService)")
	// public void classImplUserService(JoinPoint jp) {
	// System.out.println("THIS ACCOUNT CLASSSSSSSSSS ========================");
	// }
	//
	// @Before("target(com.spring.service.UserService)")
	// public void classUserService(JoinPoint jp) {
	// System.out.println("TARGET ACCOUNT CLASSSSSSSSSS ========================");
	// }
	//
	//
	// @Before("this(com.spring.service.AccountService)")
	// public void classImplAccountService(JoinPoint jp) {
	// System.out.println("TARGET ACCOUNT CLASSSSSSSSSS ========================");
	// }
	//
	// @Scope(proxyMode=ScopedProxyMode.INTERFACES)
	// @Before("this(com.spring.service.AccountService)")
	// public void classImplUserServiceImpl(JoinPoint jp) {
	// System.out.println("THIS ACCOUNT CLASS __________________");
	// }
}
