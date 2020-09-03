package com.spring.service.subservice;

import org.springframework.stereotype.Service;

@Service
public class SubUserServiceImpl implements SubUserService {

	@Override
	public void subMethodSpecific() {
		System.out.println("void subMethodSpecific() calling ....");
	}
}
