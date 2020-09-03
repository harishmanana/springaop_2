package com.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MoreAccountService extends AccountService{
	public String giveBalance() {
		return "Balance = " + 10000;
	}
}
