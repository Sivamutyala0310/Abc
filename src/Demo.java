import java.util.*;
public class Demo {

	public static void main(String[] args) 
	{
		System.out.println("connection is established");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numerator");
		int a=scan.nextInt();
		System.out.println("enter the denominator");
		int b=scan.nextInt();
		scan.close();
		int c=a/b;
		System.out.println(c);
		System.out.println("connection is terminated");
		}

}
