import java.util.*;

public class MultipleCatch 
{

	public static void main(String[] args)
	
	{
		System.out.println("Connection is established");
		Scanner scan=new Scanner(System.in);
		try
		{
		System.out.println("Enter the numerator");
		int n=scan.nextInt();
		System.out.println("Enter the denominator");
		int d=scan.nextInt();
		int c=n/d;
		System.out.println(c);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the element to be stored");
			int elem=scan.nextInt();
			System.out.println("enter the index position at which the element to be stored");
			int pos=scan.nextInt();
			arr[pos]=elem;
			scan.close();
			System.out.println(arr[pos]);
		}
		
		catch(NegativeArraySizeException a)
		{
			System.out.println("plz provide the Positive arraysize");
		}
		catch(ArithmeticException b)
		{
			System.out.println("plz provide non zero denominator");
		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("plz provide the index position within the boundary of an array");
		}
		
		/*catch(Exception e)
		{
			System.out.println("some more Exceptions are definied under same genericException");
		}*/
		finally {
			
		}
		System.out.println("connection is terminated");
	}

}
