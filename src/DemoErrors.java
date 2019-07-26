
	import java.util.Scanner;
	public class DemoErrors {

		public static void main(String[] args) {
			
		Bank1 b=new Bank1();
		b.initiate();

		}
	}
	class Bank1
	{
		public void initiate()
		{
			
			Atm atm=new Atm();
			
			try {
			atm.acceptInput();
			atm.verify();
			}
			catch(Exception e)
			{
				try {
					atm.acceptInput();
					atm.verify();
				}
				catch(Exception f)
				{
					
					try {
						atm.acceptInput();
						atm.verify();
					}
					
					catch(Exception g)
					{
						System.out.println("card blocked");
						System.exit(0);
					}
				}
			}
		}
	}
	class Atm1
	{
		private int accNbr=2222;
		private int password=3333;
		private int ac;
		private int pw;
		public void acceptInput()
		{
			Scanner scan=new Scanner(System.in);
			ac=scan.nextInt();
			pw=scan.nextInt();
			scan.close();
		}
		public void verify()throws Exception
		{
			if(ac==accNbr&&pw==password)
			{
				System.out.println("take money");
			}
			else
			{
				
				InvalidCustomer ic=new InvalidCustomer();
					System.out.println(ic.getMessage());
					throw ic;
			}
		}
	}
class InvalidCustomer extends Exception
{
	
	public String getMessage()
	{
		return "invalid customer details try again!";
	}
}


