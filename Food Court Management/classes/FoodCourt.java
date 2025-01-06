package classes;

import interfaces.*;

public class FoodCourt implements IRestaurant, IEmployee 
{
	
	private Restaurant restaurant[] = new Restaurant [100];
	private Employee employee[] = new Employee [100];
	
	
	
	//Restaurant
	public void addRestaurant(Restaurant r)
	{
		int flag = 0;
		for(int i=0; i<restaurant.length; i++)
		{
			if(restaurant[i] == null)
			{
				restaurant[i] = r;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("_________Restaurant Inserted_________");
		}
		else
		{
			System.out.println("________Restaurant Can Not Be Inserted_________");
		}
	}
	
	public void removeRestaurant(Restaurant r)
	{
		
		for(int i=0; i<restaurant.length; i++)
		{
			if(restaurant[i] == r)
			{
				restaurant[i] = null;
				
				break;
			}
		}
		if(r != null)
		{
			System.out.println("_______Restaurant is Removed_______");
		}
		else
		{
			System.out.println("_______Restaurant Can Not Be Removed__________");
		}
	}
	
	
	public void showAllRestaurant()
	{
		System.out.println("______________________________");
		for(Restaurant r : restaurant)
		{
			if(r != null)
			{
				System.out.println("Restaurant Name : "+ r.getName());
				System.out.println("Restaurant Shop No : "+ r.getShopNo());
				System.out.println("Restaurant Food Type : "+ r.getFoodType());
				
				System.out.println();
			}
		}
		System.out.println("______________________________");
	}
	
	
	public Restaurant getRestaurant(String shopNo)
	{
		Restaurant r = null;
		
		for(int i=0; i<restaurant.length; i++)
		{
			if(restaurant[i] != null)
			{
				if(restaurant[i].getShopNo().equals(shopNo))
				{
					r = restaurant[i];
					break;
				}
			}
		}
		if(r != null)
		{
			System.out.println("_______Resturant is Found_______");
		}
		else
		{
			System.out.println("_______Resturant is Not Found_______");
		}
		return r;
	}
	
	
	
	//Employee 
	
	public void addEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employee.length; i++)
		{
			if(employee[i] == null)
			{
				employee[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("_______Employee Added_______");
		}
		else
		{
			System.out.println("_______Can Not Added_______");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		
		for(int i=0; i<employee.length; i++)
		{
			if(employee[i] == e)
			{
				employee[i] = null;
				
				break;
			}
		}
		
		if(e != null)
		{
			System.out.println("_______Employee Removed_______");
		}
		else 
		{
			System.out.println("_______Employee Can Not Be Removed________");
		}
	}
	public void showAllEmployees()
	{
		System.out.println("________________________");
		for(Employee e : employee)
		{
			if(e != null)
			{
				System.out.println(" Employee Name : "+ e.getEmpName());
				System.out.println(" Employee ID : "+ e.getEmpId());
				System.out.println(" Salary : "+ e.getEmpSalary());
				System.out.println();
			}
		}
		System.out.println("_________________________");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employee.length; i++)
		{
			if(employee[i] != null)
			{
				if(employee[i].getEmpId().equals(empId))
				{
					e = employee[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("_______Employee Found_______");
		}
		else
		{
			System.out.println("_______Employee Not Found_______");
		}
		return e;
	}
}