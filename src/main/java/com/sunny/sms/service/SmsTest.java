package com.sunny.sms.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class SmsTest {
	
	public String getDate() {
		return new Date().toString();
	}
	
}
