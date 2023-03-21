package DTO;

public class EmployeeDto 
{
	private int empId;
	private String empName;
	private String empAddress;
	private String empDepartment;
	private long salary;
	
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public String getEmpAddress()
	{
		return empAddress;
	}
	public void setEmpAddress(String empAddress)
	{
		this.empAddress=empAddress;
	}
	public String getEmpDepartment()
	{
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment)
	{
		this.empDepartment=empDepartment;
	}
	public long getSalary()
	{
		return salary;
	}
	public void setSalary(long salary)
	{
		this.salary=salary;
	}
}
