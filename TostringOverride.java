package com.jsp.ObjectClass;

class Employee
{
	
	int id;
	String name;
	int age;
	public int eid;
	
	
	public Employee(int id, String name, int age) 
	{
		this.id =id;
		this.name=name;
		this.age=age;
	
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ",name=" + name + ",age=" + age +"]";
	}
	
}

public class TostringOverride 
{
	public static void main(String []args)
	{
		Employee emp1 = new Employee(102,"ganesh",22);
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee(103,"Ashok",22);
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee(104,"shiva",24);
		System.out.println(emp3.toString());
		
		
		
		
	}

}
