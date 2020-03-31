package org.com.SpringAop.Examples;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeforeAfterAdvisor
{
 
	@Pointcut("execution(* ImplementA.methodA2(..))")
	private void pointCutBeforeAdvice()
	{
		
	}
	
	@Before("pointCutBeforeAdvice()")
	public void addingBeforeAdvice()
	{
		System.out.println("Before Advice: - Interceptor method called before calling Business logic method");
	}
	
	@Pointcut("execution(* ImplementA.methodB*(..))")
	private void pointCutAfterAdvice() {}
	
	@After("pointCutAfterAdvice()")
	public void ExecuteAfterAdvice()
	{
		System.out.println("After Advice:- Interceptor method called after calling Business logic method");
	}
	
}
