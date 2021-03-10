package com.app;

import javax.faces.bean.ManagedBean;

import com.jk.web.faces.mb.JKManagedBean;

@ManagedBean(name = "controller")
public class Controller extends JKManagedBean {
	String name;

	public String sayHello() {
		success("Hello, " + name);
		return null;// return to the same page when the action finish
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
