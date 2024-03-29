package com.app;

import javax.swing.JOptionPane;

import com.jk.core.exceptions.handler.ExceptionHandler;
import com.jk.core.exceptions.handler.JKExceptionHandler;
import com.jk.core.util.JK;

@ExceptionHandler
public class CustomExceptionHandler implements JKExceptionHandler<ArrayIndexOutOfBoundsException> {

	@Override
	public void handle(ArrayIndexOutOfBoundsException throwable, boolean throwRuntimeException) {
		JOptionPane.showMessageDialog(null, "My ArrayIndexException Handler");
	}

}
