package com.atmecs;

import java.math.BigInteger;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args)
	{
		for(;;)
		{
		System.out.println("click 1. For factorial, 2.For finding next immediate Prime nbr and 3.For fabonci series");
		Scanner scan=new Scanner(System.in);
		int nbr=scan.nextInt();
		if(nbr==1)
		{
			System.out.println("enter the number to find the factorial");
			int  number=scan.nextInt();
			BigInteger value=MathematicalOperations.factorial(number);
			System.out.println(value);
		}
		
		else if(nbr==2)
		{
			System.out.println("enter the number to find the nextImmediatePrime");
			int  number=scan.nextInt();
			MathematicalOperations.nextImmediatePrime(number);
		}
		else if(nbr==3)
		{
			int firstNbr=0;
			int secondNbr=1;
			int result=1;
			MathematicalOperations.fabonciSeries(firstNbr,secondNbr,result);
		}
		else
		{
			System.out.println("please enter in b/w 1-3");
		}
		}
		
}
}
