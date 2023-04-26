package com.app;

import com.jk.core.annotations.Logged;
import com.jk.web.faces.controllers.JKWebController;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("controller")
@ViewScoped
public class Controller extends JKWebController {
	String name;
	
	@Inject
	com.app.Handler handler;

	@Logged
	public String sayHello() {
		success(handler.sayHelloImpl(name));
		return null;// return to the same page when the action finish
	}
	
	@Logged
	public String sayHello(String name) {
		success(handler.sayHelloImpl(name));
		return null;// return to the same page when the action finish
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
