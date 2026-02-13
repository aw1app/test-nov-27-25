package com.sl.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.sl.Account.deposit(..))")
	public void m1() {

		//System.out.println(" (LOG) m1 this is an Before type INTERCEPTOR/ADVICE ");
		System.out.println(" (LOG) m1 got a request to deposit amount ");		

	}
	
	@Before("execution(* com.sl.Account.withdraw(..))")
	public void m2() {

		//System.out.println(" (LOG) m1 this is an Before type INTERCEPTOR/ADVICE ");
		System.out.println(" (LOG) got a request to  withdrawal amount ");		

	}

}
