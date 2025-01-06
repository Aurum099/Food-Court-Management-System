package classes;



public class RestaurantServices 
{
	private ServiceCenter service;
	protected String shopNo;
	protected double balances;
	
	
	
	public void setService(ServiceCenter service)
	{
		this.service=service;
	}
	public ServiceCenter getService()
	{
		return service;
	}
	
	public void setShopNo(String shopNo)
	{
		this.shopNo=shopNo;
	}
	public String getShopNo()
	{
		return shopNo;
	}
	
	
	

	public void setBalances(double balances)
	{
		this.balances = balances;
	}
	
	public double getBalances()
	{
		return balances;
	}
	
	
}
	