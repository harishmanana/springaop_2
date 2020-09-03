package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	public void methodSpecific() {
		System.out.println("void methodSpecific() calling ....");
	}

	public void nextMethod() {
		System.out.println("void nextMethod service() calling ....");
	}
	
	public void methodWithParam(int a, int b, int c) {
		System.out.println("void methodWithParam(int a, int b, int c) calling.....");
	}

	public void methodWithThreeParam(int a, int b, int c) {
		System.out.println("void methodWithThreeParam(int a, int b, int c) calling.....");
	}
	
	public int methodWithParam(int a, int b) {
		System.out.println("int methodWithParam(int a, int b) calling ....");
		return 0;
	}

	public String methodWithParam(String a, String b) {
		System.out.println("String methodWithParam(String a, String b) calling....");
		return null;
	}

	public double methodWithParam(double a, double b) {
		System.out.println("double methodWithParam(double a, double b) calling....");
		return 0;
	}
	
	public void methodWithTwoParam(String a, String b) {
		System.out.println("void methodWithTwoParam(String a, String b) calling....");
	}
	
	public void methodForAround() {
		System.out.println("void methodForAround() calling ....");
	}
	
	public void methodForAround(int a) {
		System.out.println("void methodForAround(int a) calling ....");
	}
	
	public int methodWithTwoParamThrow(int a, int b) throws Exception {
		System.out.println("int methodWithTowParamThrow(int a, int b) calling ....");
		throw new Exception();
	}
	public int methodWithTwoParamThrow(String a, String b)  throws Exception {
		System.out.println("int methodWithTowParamThrow(String a, String b) calling ....");
		throw new Exception();
	}
}
