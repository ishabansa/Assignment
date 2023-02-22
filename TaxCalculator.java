package com.cognizant.tax;
import java.util.*;
//Create TaxCalculator Class
class TaxCalculator {
	//instance variables
static float basicSalary;
static boolean citizenship;
static int nettSalary;
static float tax;
//create method 1
static void calculateTax() {
	tax = 30*basicSalary/100;
	System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
}
// create method 2
static void deductTax() {
	nettSalary = (int) (basicSalary-tax);
	System.out.println("The nett salary of the employee: "+nettSalary);
}
static void validateSalary() {
	boolean response=(basicSalary>100000 && citizenship==true);
	if(response) {
		System.out.println("The salary and citizenship eligibility: "+response);
	}
	else {
		System.out.println("The salary and citizenship eligibility: "+response);
	}
}
}
	class EmployeeTax{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Salary");
			TaxCalculator.basicSalary=sc.nextFloat();
			System.out.println("Enter citizenship (true if inside otherwise false)");
			TaxCalculator.citizenship=sc.nextBoolean();
			sc.close();
			TaxCalculator.calculateTax();
			TaxCalculator.deductTax();
			TaxCalculator.validateSalary();
		}
	}