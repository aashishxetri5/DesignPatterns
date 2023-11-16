/**
 *
 */
package com.practice.Factory;

/**
 * @author asus
 */
public class QA implements Employee{

	@Override
	public int getSalary() {
		
		System.out.println("Salary of QA: ");
		return 40000;

	}
}
