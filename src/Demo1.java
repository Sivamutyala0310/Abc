import java.util.*;
public class Demo1 
{

	public static void main(String[] args)
	{
		System.out.println("connection is established");
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("enter the numerator");
			int a=scan.nextInt();
			System.out.println("enter the denominator");
			int b=scan.nextInt();
			scan.close();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured because you have given denominator as zero");
		}
		System.out.println("connection is terminated");
	}

}
