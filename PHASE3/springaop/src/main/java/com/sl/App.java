package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.sl")
@Configuration
@EnableAspectJAutoProxy
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		Account acct1 = context.getBean(Account.class);
		
		// Create some accounts
		//Account acct1 = new Account("Madhusudan", 1001, 0.0f);

		acct1.deposit(1000.0f);

		System.out.printf("\n Balance for account id %d : %s \n", acct1.getId(), acct1.getBalance());

		acct1.deposit(2500.0f);
		

		System.out.printf("\n Balance for account id %d : %s \n", acct1.getId(), acct1.getBalance());
		
		acct1.withdraw(1500.0f);
	
		System.out.printf("\n Balance for account id %d : %s \n", acct1.getId(), acct1.getBalance());
		
		acct1.withdraw(-20.0f);
		
		System.out.printf("\n Balance for account id %d : %s \n", acct1.getId(), acct1.getBalance());
		
		
		// FixedDeposit account
		System.out.println("\n\n FixedDeposit account fd1 ");
		FixedDeposit fd1 = context.getBean(FixedDeposit.class);
		System.out.println("fd1.isBroken = "+fd1.isBroken());
		fd1.breakFD();
		System.out.println("fd1.isBroken = "+fd1.isBroken());
		

	}

}
