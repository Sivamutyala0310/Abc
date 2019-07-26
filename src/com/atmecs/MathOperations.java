package com.atmecs;
import java.util.*;

public class MathOperations {

	public static void main(String[] args) {
		int []a=new int[8];
		int sum=0;
		int sub=0;
		int mul=1;
		int div=1;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			sum=a[j]+a[j+1];
			break;
		}
		
		System.out.println(sum);
		for(int k=a[2];k<a.length;k++)
		{
			sub=a[2]-a[3];
			break;
		}
		System.out.println(sub);
		for(int m=a[4];m<a.length;m++)
		{
			mul=a[4]*a[5];
			break;
		}
		System.out.println(mul);
		for(int d=a[6];d<a.length;d++)
		{
			div=a[6]/a[7];
			break;
		}
		System.out.println(div);
		System.out.println("total sum:"+(sum+sub+mul+div));
	}

}
