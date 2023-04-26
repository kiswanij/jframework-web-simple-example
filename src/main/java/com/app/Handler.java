package com.app;

import java.io.Serializable;

import jakarta.annotation.Resource;

@Resource
public class Handler implements Serializable{
	
	public String sayHelloImpl(String name) {
		return "Real hello to " + name;
	}
}
