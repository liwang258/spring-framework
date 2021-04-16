package com.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
	public void sayHi() {
		System.out.println("Hello Spring！");
	}
}
