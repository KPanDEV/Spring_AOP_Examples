package org.com.SpringAop.Examples;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterReturningAdvisor {
	
	@AfterReturning(
			pointcut = "execution(* AfterReturningImpl.*(..))",
			returning = "result")
	
	public void afterReturningAdvice(JoinPoint jp, Object result)
	{
		System.out.println("=========================================================");
		System.out.println("Running AfterRunningAdvice before business logic"+"\n");
		System.out.println("Signature ="+jp.getSignature()+"\n");
		System.out.println("After Result ="+result+"\n");
		System.out.println("AfterRetruning Advice is done now"+"\n");
		System.out.println("=========================================================");
		
	}
	
	
}
