package com.example.internal_working_of_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//entry point of spring boot application
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner
{


	public static void main(String[] args)
	{
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

// private Razor_pay_service rzp=new Razor_pay_service();

// throws means:
// This method may cause an error (exception), and I am not handling it here.
// If error comes → send it to caller method  Not handled inside this method

//(String... args)
//	It is Varargs (Variable Arguments) in Java.
//	Method can accept any number of String values

//  @Override
//	public void run(String... args) throws Exception
//	{
//	  String payment=	rzp.pay();
//	  System.out.println(payment);
//
//	}
//here my application is tightly  coupled

//For loose coupling,
//I declared the class Razor_pay_service under component annotation , so no need to use "new" here
// its bean is already been formed
//InternalWorkingOfSpringBootApplication is dependent on Razor_pay_service
//to list the dependencies , call constructor with the object of Razor_pay_service or use @Autowired Annotation

	//another way for dependency injection
	//@Autowired
	//telling spring that dependency injection is needed here
	//reference of this is needed here
	//using this annotation ,no need of constructor
	//using autowired , cannot make variables  final
	//private Razor_pay_service rzp;


	//this is constructor dependency injection
	//via constructor bean is injected
//	public InternalWorkingOfSpringBootApplication(Razor_pay_service rzp)
//	{
//		this.rzp=rzp;
//	}
	//here bean would be put into this class

	//	@Override
//	public void run(String... args) throws Exception
//	{
//	  String payment=	rzp.pay();
//	  System.out.println(payment);
//
//	}


   private final Payment payment;

	public InternalWorkingOfSpringBootApplication(Payment payment)
	{
		this.payment=payment;
	}

	//this is loose coupling
	//but to pass one bean , i comment out one component
	//to make no changes in the code

	//go to resources--->application.properties



	//	@Override
	public void run(String... args) throws Exception
	{
	  String pay=payment.pay();
	  System.out.println(pay);

	}


}
