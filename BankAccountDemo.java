import java.util.Scanner;
public class BankAccountDemo {

	public static void main(String[] args)
	{
		String opt="";
		double amount;
		BankAccount bankaccount = new BankAccount("Antony1234","17524", 10000);
		Scanner input = new Scanner(System.in);
		System.out.println("Your Balance :"+bankaccount.balance);
		while(!opt.equals("4"))
		{
			System.out.println("Select an action\n[1]. Deposit Amount\n[2]. Withdraw Amount\n[3]. Add Interest"
			+"\n[4]. Exit\nEnter Serial number of the action");
			opt=input.next();
			if(opt.equals("1"))
			{
			System.out.println("Enter the Amount to be deposited");
			amount=Double.parseDouble(input.next());
			System.out.println("Your balance after money deposited : "+bankaccount.DepositAmount(amount)+"\n");
			}
			if(opt.equals("2"))
			{
				System.out.println("Enter the Amount to be withdrawn");
				amount=Double.parseDouble(input.next());
				if(bankaccount.available_balance()>=amount)
				{
					System.out.println("Your balance after money withdrawn : "+bankaccount.WithdrawAmount(amount)+"\n");
				}
				else
				{
					System.out.println("Money is insufficient");
				}
			}
			if(opt.equals("3"))
			{
				System.out.println("Enter the interest between 0 and 100");
				amount=Double.parseDouble(input.next());
				if(amount>=0 && amount<=100)
				{
					System.out.println("Your balance included with interest : "+bankaccount.AddInterest(amount)+"\n");
				}
				else
				{
					System.out.println("Invalid Interest");
				}
			}
			if(opt.equals("4"))
			{
				System.out.println("Exited");
			}
		}
		input.close();
	}

}
