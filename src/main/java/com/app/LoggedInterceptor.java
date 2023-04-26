package com.app;

import java.io.Serializable;
import java.util.Arrays;

import com.jk.core.logging.JKLogger;
import com.jk.core.logging.JKLoggerFactory;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Logged
@Interceptor
public class LoggedInterceptor implements Serializable{

	@AroundInvoke
	public Object aroundInvoke(InvocationContext ctx) throws Exception {
		JKLogger logger = JKLoggerFactory.getLogger(ctx.getTarget().getClass());
		Object[] parameters = ctx.getParameters();
		logger.info("calling {}({})",ctx.getMethod().getName(),Arrays.toString(parameters));
		
		try {
			return ctx.proceed();
		} catch (Exception e) {
			logger.error(e);
			return null;
		} finally {
			logger.info("/calling ({})",ctx.getMethod().getName());
		}
	}
}
