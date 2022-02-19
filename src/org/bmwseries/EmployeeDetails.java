package org.bmwseries;

public class EmployeeDetails {
	public void data() {
		long empId = 98768l;
		System.out.println(empId);
		String empName = "Karthick";
		System.out.println(empName);
		String empEmail = "karthick98@gmail.com";
		System.out.println(empEmail);
		long empPhoneno = 9842986541l;
		System.out.println(empPhoneno);
		int empSalary = 40000;
		System.out.println(empSalary);
		char empGender = 'M';
		System.out.println(empGender);
		String empCity = "Trichy";
		System.out.println(empCity);
		String empState = "Tamilnadu";
		System.out.println(empState);
		
		System.out.println("Salary is"+empSalary);
		System.out.println(empName+empGender);
		System.out.println(empId+empPhoneno+empSalary);
	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.data();
	}
}
