package com.ecommerce.bakerymanagement.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class ExceptionAspect {
	
	private static final Logger logger = Logger.getLogger(ExceptionAspect.class);
		
	@AfterThrowing(pointcut ="execution(* com.ecommerce.bakerymanagement..*.*(..))",throwing = "ex")
    public Object logAfterThrowingAllMethods(Exception ex) throws Throwable
    {
		logger.error("**Logged exception is:- " + ex+"** expecption cause is:-"+ex.getMessage());
		return ex;
    }
	

}
