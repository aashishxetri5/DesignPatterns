/**
 *
 */
package com.practice.Factory;

/**
 * @author asus
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = EmployeeFactory.getEmployee("SWE");
		System.out.println(emp1.getSalary());

		Employee emp2 = EmployeeFactory.getEmployee("QA");
		System.out.println(emp2.getSalary());

	}

}
