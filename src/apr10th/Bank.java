package apr10th;

public class Bank {
	
	private double balance = 10000;
	
	//getters 
	public double getBalance(int pin)
	{
		//validation 
		
		if(pin==3214)
		{
			return balance;
		}
		else
		{
			System.out.println("Invalid Pin ..");
			return 0.0;
		}
	}
	
	//setters
	public void setBalance(int deposit)
	{
		balance=balance+deposit;
	}
	

}
