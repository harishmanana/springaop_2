package com.spring.service;

public interface UserService {
	public void methodSpecific();
	public void nextMethod();
	
	public void methodWithParam(int a, int b, int c);
	public void methodWithThreeParam(int a, int b, int c);

	public int methodWithParam(int a, int b);
	public String methodWithParam(String a, String b);
	public double methodWithParam(double a, double b);
	public void methodWithTwoParam(String a, String b);
	
	public void methodForAround();
	public void methodForAround(int a);
	
	public int methodWithTwoParamThrow(int a, int b) throws Exception;
	public int methodWithTwoParamThrow(String a, String b)  throws Exception;
}
