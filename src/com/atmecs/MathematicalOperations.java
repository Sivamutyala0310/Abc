package com.atmecs;

import java.math.BigInteger;
import java.util.*;
	
class MathematicalOperations
{
	public static BigInteger factorial(int number)
	{
		BigInteger factorial= new BigInteger("1");

	        for (int i =number; i > 0; i--) 
	        {
	            factorial = factorial.multiply(BigInteger.valueOf(i));
	        }

	        return factorial;
	}
	public static void nextImmediatePrime(int n)
	{
		int count=0;
			while(count!=2)
			{
				n++;
				count=0;
				int i=1;
				while(i<=n)
				{
					if(n%i==0)
					{
						count++;
					}
					i++;
				}
				if(count==2)
				{
					System.out.println(n);
				}

				}
	}
	public static void fabonciSeries(int firstNbr,int secondNbr,int result)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the fabonci number");
		int n=scan.nextInt();
		for(int j=0;j<n;j++)
		{
			System.out.println(firstNbr+" ");
			firstNbr=secondNbr;
			secondNbr=result;
			result=firstNbr+secondNbr;
		}		
			
		}
		
	}

