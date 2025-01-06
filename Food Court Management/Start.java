import java.util.*;
import java.util.Scanner ;
import classes.*;
import interfaces.*;
import fileio.*;
import java.io.*;

public class Start
{
	public static void main(String args[])
	{
		System.out.println(" ****** Welcome To FOOD COURT Management Console System ****** ");
		
		boolean c = true;
		
		FoodCourt fc = new FoodCourt();
		
		Scanner sc = new Scanner(System.in);
		BufferedReader scnr = new BufferedReader(new InputStreamReader(System.in));
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		final String password = "uwu";
		
		System.out.println(" Please Enter The Password to access : ");
		
		String p = sc.next();
		if(password.equals(p))
		{
			
			while(c)
			{
				System.out.println(" _________________________ ");
				System.out.println(" What do you want to do? ");
				System.out.println(" Please Select from the options below: ");
				System.out.println("   1 - Restaurant Management ");
				System.out.println("   2 - Employee Management ");
				System.out.println("   3 - Restaurant Service Management ");
				System.out.println("   4 - Exit the Console ");
			
				try
				{
					
					int a = Integer.parseInt(scnr.readLine());
				
				
				
					if(a == 1)
					{
				
							System.out.println(" Restaurant Management is selected ");				
							System.out.println(" What do you want to do now? ");				
							System.out.println("   1 - Add Restaurant ");				
							System.out.println("   2 - Remove Restaurant ");				
							System.out.println("   3 - Show All Restaurant ");				
							System.out.println("   4 - Go to previous menu ");	
						try
						{
							int case1 = Integer.parseInt(scnr.readLine());
				
							switch(case1)
							{
								case 1:
					
								System.out.println(" You want to Add New Restaurant ");
					
								System.out.println(" Enter New Restaurant Name : ");
								String name= sc.next();
					
								System.out.println(" Enter New Restaurant Shop No : ");
								String shopNo= sc.next();
						
								System.out.println(" Enter New Restaurant Food Type : ");
								String foodType= sc.next();
						
					
								Restaurant r = new Restaurant();
								r.setName(name);
								r.setShopNo(shopNo);
								r.setFoodType(foodType);
					
								fc.addRestaurant(r);
						
								break;
					
					
								case 2:
					
								System.out.println(" You want to Remove a Restaurant ");
								System.out.println(" Please enter Restaurant Shop No : ");
								fc.removeRestaurant(fc.getRestaurant(sc.next()));
					
								break;
					
								case 3:
								System.out.println(" You want to Show All Restaurant");
					
								fc.showAllRestaurant();
					
								break;
					
								case 4:
								System.out.println(" You want to Go back to previous menu ");
					
								break;
					
								default:
								System.out.println(" Your given input is invalid ");
							
								break;
					
							}
						}
							catch (Exception e)
							{
								System.out.println(" Your Input was invalid, Please Enter Integer ");
				
							}
					}
					else if(a == 2)
					{
						try
						{
							System.out.println(" Employee Management is selected ");				
							System.out.println(" What do you want to do now ? ");				
							System.out.println("   1 - Add Employee ");				
							System.out.println("   2 - Remove Employee ");				
							System.out.println("   3 - Show All Employee ");				
							System.out.println("   4 - Go to previous menu ");	
					
							int case2 = Integer.parseInt(scnr.readLine());
						
							switch(case2)
							{
								case 1:
							
								System.out.println(" Add Employee is selected ");
						
								System.out.println(" Enter Employee Name : ");
								String empName=sc.next();
						
								System.out.println(" Enter Employee ID : ");
								String empId= sc.next();
						
								System.out.println(" Enter Employee Salary : ");
								int empSalary=sc.nextInt();
						
								Employee e = new Employee ();
								e.setEmpName(empName);
								e.setEmpId(empId);
								e.setEmpSalary(empSalary);
						
								fc.addEmployee(e);
						
								break;
						
								case 2:
							
									System.out.println(" Remove Employee is selected ");
									System.out.print(" Please Enter Employee Id : ");
							
							
									fc.removeEmployee(fc.getEmployee(sc.next()));
							
									break;
							
								case 3:
								
									System.out.println(" Show All Employee is Selected ");
							
									fc.showAllEmployees();
							
									break;
							
								case 4:
							
									System.out.println(" You want to Go back to previous menu ");
									break;
						
								default:
							
									System.out.println(" Your given Input is Invalid ");
									break;
						
							}	
						}
						catch (Exception e)
							{
								System.out.println(" Your Input was invalid, Please Enter Integer ");
				
							}
					
					}
			
					else if(a == 3)
					{				
						try
						{
							System.out.println(" Restaurant Services is Selected ");
							System.out.println(" Please select from the option below : ");
							System.out.println("	1. Cash in ");
							System.out.println("	2. Cash Out ");
							System.out.println("	3. Show Transaction History ");
							System.out.println("	4. Go Back ");
	
					
							int case3 = Integer.parseInt(scnr.readLine());
					
							switch(case3)
							{
								case 1:
							
									RestaurantServices rs1 = new RestaurantServices();
									ServiceCenter s1 = new ServiceCenter();
									
									System.out.print(" Enter Restaurant Shop No : ");
									String shopNo1 = sc.next();
							
							
									System.out.print(" Enter Cash In Amount : ");
									double amount1 = sc.nextDouble();
							
									rs1.setShopNo(shopNo1);
									s1.cashIn(amount1);
									rs1.setService(s1);
									rs1.getService();
									frwd.writeInFile(amount1+" Taka is Cash In for Restaurant No.: "+shopNo1);
									break;
								
								case 2:
									RestaurantServices rs2 = new RestaurantServices();
									ServiceCenter s2 = new ServiceCenter();
							
									System.out.print(" Enter Restaurant Shop No : ");
									String shopNo2 = sc.next();
							
									System.out.print(" Enter Cash Out Amount: ");
									double amount2 = sc.nextDouble();
								
									rs2.setShopNo(shopNo2);
									s2.cashOut(amount2);
									rs2.setService(s2);
									rs2.getService();
									frwd.writeInFile(amount2+" Taka is Cash Out from Shop No: "+shopNo2);
									break;
							
						
								case 3:
						
									try
									{
										frwd.readFromFile();
										
									
									break;
									}
									catch(Exception e)
									{
										System.out.println("There is no Transaction History");
										continue;
									}
						
								case 4:
						
									System.out.println(" You have Selected to Go Back ");
									break;
							
								default:
						
									System.out.println(" Invalid Input ");
									break;
							}
						}
						catch (Exception e)
							{
								System.out.println(" Your Input was invalid, Please Enter Integer ");
					
							}
					}
			
					else if(a == 4)
					{	
						
						System.out.println(" Console Exit is Selected ");
						System.out.println(" Thank You for using Food Court Management Console ");
						c = false;
						break;
						
						
					}
					else 
					{
						System.out.println(" Invalid Input ");
					}
					
				
			
			
			
				}
						catch(Exception e)
						{
							
							System.out.println(" Your Input was invalid, Please Enter Integer ");
							
						}
				
			}
		}
		else
		{
			System.out.println(" Wrong Password ");
		}
			
			
			
	}				
}
			



