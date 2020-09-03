package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeAdviceExecutionPointcut {
	
	@Around("execution(* com.spring.service.UserService.*(*, *))")
	public void beforeMethodSpecific(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("\nBEFORE");
        jp.proceed();
        System.out.println("\nAFTER...");
    }
	
	
//	@Before("execution(* com.spring.service.UserService.*(int, int, int))")
//	public void beforeAnyMethodWithThreeParams(JoinPoint jp) {
//        System.out.println("\nAny Method with 3 parameter calling ....");
//    }
//
//	@Before("execution(int com.spring.service.UserService.*(*, *))")
//	public void beforeMethodWithTwoParamsIntReturn(JoinPoint jp) {
//        System.out.println("\nAny Method with 2 parameter and int return calling ....");
//    }
//	
//	@Before("execution(int com.spring.service.UserService.*(int, int))")
//	public void beforeMethodWithTwoIntParamsIntReturn(JoinPoint jp) {
//        System.out.println("\nAny Method with 2 int parameter and int return calling ....");
//    }
//
//	@Before("execution(* com.spring.service.UserService.*(*, *))")
//	public void beforeMethodWithTwoParamsAnyReturn(JoinPoint jp) {
//        System.out.println("\nAny Method with 2 parameter and any return calling ....");
//    }
}
