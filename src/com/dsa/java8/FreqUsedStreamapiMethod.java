package com.dsa.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	
	private String empName;
	private BigDecimal salaray;
	private String location;
	
	
	
	public Employee(String empName, BigDecimal salaray, String location) {
		super();
		this.empName = empName;
		this.salaray = salaray;
		this.location = location;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public BigDecimal getSalaray() {
		return salaray;
	}
	public void setSalaray(BigDecimal salaray) {
		this.salaray = salaray;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salaray=" + salaray + ", location=" + location + "]";
	}
	
	
	
	
}
public class FreqUsedStreamapiMethod {

	public static void main(String[] args) {
		Employee employee = new Employee("Divakar",new BigDecimal(60000),"Vizag");
		Employee employee1 = new Employee("Suresh",new BigDecimal(990000),"Vizag");
		Employee employee2 = new Employee("Mike",new BigDecimal(1000),"Vizag");
		Employee employee3 = new Employee("Nile",new BigDecimal(3000),"Bang");
		
		List<Employee> asList = Arrays.asList(employee,employee1,employee2,employee3);
		
//		List<Employee> collect = asList.stream().filter(x -> x.getSalaray() ).collect(Collectors.toList());
		
		List<String> collect2 = asList.stream().map(Employee::getEmpName).collect(Collectors.toList());
		
		BigDecimal totalsalary = asList.stream().map(Employee::getSalaray).reduce(BigDecimal.ZERO,BigDecimal::add);
		
		System.out.println(totalsalary);

	}

}
