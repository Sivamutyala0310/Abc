import java.util.*;
public class Rts {

	public static void main(String[] args) {
		
	Bank b=new Bank();
	b.initiate();

	}
}
class Bank
{
	public void initiate()
	{
		
		Atm atm=new Atm();
		atm.acceptInput();
		atm.verify();
	}
}
class Atm
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
	public void verify()
	{
		if(ac==accNbr&&pw==password)
		{
			System.out.println("take money");
		}
		else
		{
		System.out.println("wrong details check any again");
	}
}
}
