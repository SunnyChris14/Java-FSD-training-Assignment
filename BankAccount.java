public class BankAccount
{
	String customerid;
	String accountid;
	double balance;
	
	public BankAccount(String customerid,String accountid,int balance)
	{
		this.customerid=customerid;
		this.accountid=accountid;
		this.balance=balance;
	}
	
	public double DepositAmount(double amount)
	{
		this.balance= this.balance + amount;
		return this.balance;
	}
	
	public double WithdrawAmount(double amount)
	{
		if(amount>this.balance)
		{
			return -1;
		}
		else
		{
			this.balance=this.balance-amount;
			return this.balance;
		}
	}
	
	public double AddInterest(double percent)
	{
		this.balance=this.balance+this.balance*percent/100;
		return this.balance;
	}
	
	public double available_balance()
	{
		return this.balance;
	}
	
	
}
