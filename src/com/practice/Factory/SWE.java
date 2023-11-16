package com.practice.Factory;

/**
 * @author asus
 */
public class SWE implements Employee {

	@Override
	public int getSalary() {
		
		System.out.println("Salary of SWE: ");
		return 50000;

	}

}
