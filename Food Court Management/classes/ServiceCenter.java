package classes;

import java.util.Scanner ;

public class ServiceCenter extends RestaurantServices
{
	protected int serviceNo;
	
	public void setServiceNo(int serviceNo)
	{
		this.serviceNo = serviceNo;
	}
	public int getServiceNo()
	{
		return serviceNo;
	}
	
	
	public void cashIn(double amount)
	{	
		Scanner scnr = new Scanner(System.in);
		
		System.out.print(" Enter Current Balance : ");
		double balances = scnr.nextDouble();
		if(amount>0)
		{
			System.out.println ("_________________________________");
			
			System.out.println(" Previous Balance : "+ balances);
			System.out.println(" Cash In Amount : "+ amount);
			
			balances = balances + amount;
			
			System.out.println(" Current Balance : "+ balances);
		}
		else
		{
			System.out.println(" Cash In Not Possible ");
		}
		
		
	}
	
	
	
	public void cashOut(double amount)
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.print(" Enter Current Balance : ");
		double balances = scnr.nextDouble();
		if(amount>0 && balances>amount)
		{
			System.out.println ("_________________________________");
			
			System.out.println(" Previous Balance : "+ balances);
			System.out.println(" Cash Out Amount : "+ amount);
			
			balances = balances - amount;
			
			System.out.println(" Current Balance : "+ balances);
		}
		else
		{
			System.out.println(" Cash Out Not Possible ");
		}
	}
}
