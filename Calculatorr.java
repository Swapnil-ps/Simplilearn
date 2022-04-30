	package com.simplilearn.operation;

import java.util.Scanner;

public class Calculatorr {
	public static void main (String args[]) { 
		Scanner sc = new Scanner( System.in) ;
		System.out.println(" Enter first Number N1");
		int n1=sc.nextInt();
		System.out.println("Enter second Number N2");
		int n2 = sc.nextInt();
		System.out.println("Enter Arithmatic operation"
		        +"1 .for Addition"
				+"2.for Subtraction"
				+"3.for multiplication"
				+"4.for Division"
				+"5.for Modulous");
		int num=sc.nextInt();
		if (num==1) { 
			int add=n1+n2;
			System.out.println("Addition of two numbers is "+add);
		}
				
				
				
				
				
	}

}
