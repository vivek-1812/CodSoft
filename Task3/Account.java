package Task3;

public class Account {

	private double accbalance=50000;
	
	public double chechBalance()
	{
		return this.accbalance;
	}
	public void withdraw(double amount)
	{
	   if(amount>this.accbalance)
	   {
		   System.out.println("INSUFFUCIENT BALANCE\n---------------------------------------------");
		   
	   }
	   else
	   {
		  this.accbalance= this.accbalance-amount;
		  System.out.println("AMOUNT SUCCESFULLY WITHDRAWN\n----------------------------------------------");
	   }
	}
	public void deposit(double amount)
	{
		this.accbalance=this.accbalance+amount;
		System.out.println("AMOUNT SUCCESFULLY DEPOSITED\n-----------------------------------------------");
	}
	
	
}
