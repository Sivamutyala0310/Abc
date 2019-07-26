import java.util.*;
public class Launch {

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int last=scan.nextInt();
		int i=0;
		int f=1;
		int result=1;
		for(int j=0;i<last;j++)
		{
			System.out.print(i+" ");
			i=f;
			f=result;
			result=f+i;
		}
			
		}
	}
