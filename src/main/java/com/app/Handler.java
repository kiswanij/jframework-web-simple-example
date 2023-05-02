package com.app;

import java.io.Serializable;

import jakarta.enterprise.inject.Model;

//import com.jk.core.annotations.DataAccess;

@Model
public class Handler implements Serializable{
	
	public String sayHelloImpl(String name) {
		return "Real hello to " + name;
	}
}
