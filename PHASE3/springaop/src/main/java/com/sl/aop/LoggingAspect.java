package com.sl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.sl.Account.deposit(..))")
	public void m1() {

		//System.out.println(" (LOG) m1 this is an Before type INTERCEPTOR/ADVICE ");
		System.out.println("(LOG) m1 got a request to deposit amount ");		

	}
	
	@Before("execution(* com.sl.Account.withdraw(..))")
	public void m2() {

		//System.out.println(" (LOG) m1 this is an Before type INTERCEPTOR/ADVICE ");
		System.out.println(" (LOG) got a request to  withdrawal amount ");		

	}
	
	// After advice
	@After("execution(* com.sl.Account.withdraw(..))")
	public void m3() {
		//System.out.println(" (LOG) m1 this is an Before type INTERCEPTOR/ADVICE ");
		System.out.println(" (LOG) completed request to  withdrawal amount ");	
	}
	
	//Around advice
	@Around("execution(* com.sl.FixedDeposit.breakFD(..))")
	public void m4(ProceedingJoinPoint pjp) throws Throwable {
		//System.out.println(" (LOG) m4 this is an Around type INTERCEPTOR/ADVICE ");
		System.out.println(" (LOG) BEFORE break FD called.");
		long start = System.nanoTime();
		
		pjp.proceed();
		
		long end = System.nanoTime();
		long timeTaken = (end - start) / 1_000_000;
		
		System.out.println(" (LOG) AFTER break FD called.");
		System.out.println(" (PERF) break FD took " + timeTaken + " milli secs to execute");
	}
}
