package interfaces;

import classes.*;

public interface IEmployee
{
	void addEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}