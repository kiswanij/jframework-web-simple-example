package com.app;

import java.io.Serializable;

import com.jk.core.annotations.DataAccess;

@DataAccess
public class Handler implements Serializable{
	
	public String sayHelloImpl(String name) {
		return "Real hello to " + name;
	}
}
