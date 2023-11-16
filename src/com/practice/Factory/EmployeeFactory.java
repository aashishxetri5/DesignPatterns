/**
 *
 */
package com.practice.Factory;

/**
 * @author asus
 */
public class EmployeeFactory {

//	Factory methods

	public static Employee getEmployee(String employeeType) {
		if (employeeType.trim().equalsIgnoreCase("SWE"))
			return new SWE();
		else if (employeeType.trim().equalsIgnoreCase("QA"))
			return new QA();
		else
			return null;
	}
}
