package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OtherAdvice {
//	@After("execution(void com.spring.service.UserService.methodSpecific())")
//	public void afterMethodSpecific(JoinPoint jp) {
//        System.out.println("@After ... Specific method calling ....\n");
//    }
//	
//	@AfterReturning("execution(* com.spring.service.UserService.*(int, int, int))")
//	public void afterReturningAnyMethodWithThreeParams(JoinPoint jp) {
//        System.out.println("@After returning...Any Method with 3 parameter calling ....\n");
//    }
//
//	@AfterThrowing("execution(int com.spring.service.UserService.*(*, *))")
//	public void afterThrowingMethodWithTwoParamsIntReturn(JoinPoint jp) {
//        System.out.println("@AfterThrowing ... Any Method with 2 parameter and int return calling ....");
//    }
//	
//	@Around("execution(* com.spring.service.UserService.methodForAround(..))")
//	public void aroundMethodWithTwoIntParamsIntReturn(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("\nAround .... Any Method with 2 int parameter and int return calling ....");
//        System.out.println("@Around BEFORE ......");
//        pjp.proceed();
//        System.out.println("@Around AFTER ......");
//    }
}
