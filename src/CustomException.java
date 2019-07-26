
	import java.util.Scanner;
	public class CustomException {

		public static void main(String[] args) {
			
		Bank2 b=new Bank2();
		b.initiate2();

		}
	}
	class Bank2
	{
		public void initiate2()
		{
			
			Atm2 atm=new Atm2();
			try
			{
			atm.acceptInput2();
			atm.verify2();
			}
			catch(Exception a)
			{
				try
				{
					atm.acceptInput2();
					atm.verify2();
				}
				
				catch(Exception b)
				{
				try
				{
						atm.acceptInput2();
						atm.verify2();
				}
					
					catch(Exception c)
					{
						System.out.println("card blocked");
					}
				}
			}
		}
	
	}
	class Atm2
	{
		private int accNbr=2222;
		private int password=3333;
		private int ac;
		private int pw;
		public void acceptInput2()
		{
			Scanner scan=new Scanner(System.in);
			ac=scan.nextInt();
			pw=scan.nextInt();
		
		}
		public void verify2()throws Exception
		{
			if(ac==accNbr&&pw==password)
			{
				System.out.println("take money");
			}
			else
			{
				
				InvalidCustomer2 ic=new InvalidCustomer2();
					System.out.println(ic.getMessage());
					throw ic;
			}
		}
	}
class InvalidCustomer2 extends Exception
{
	
	public String getMessage()
	{
		return "invalid customer details try again!";
	}
}




