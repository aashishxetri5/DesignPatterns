/**
 *
 */
package com.practice.Singleton;

/**
 * @author asus
 */
public enum Vehicle {

	INSTANCE;

	/**
	 * 
	 * private static Vehicle vehicle;
	 * 
	 * private Vehicle() {
	 * 	if (vehicle != null) {
	 * 		throw new RuntimeException("You're trying to break singleton pattern.");
	 * 	}
	 * }
	 * 
	 * // This is suitable for multi-threaded environment.
	 * public static Vehicle getVechicle() {
	 * 	if (vehicle == null) { 
	 * 		synchronized (Vehicle.class) {
	 * 			vehicle = new Vehicle();
	 * 		}
	 * 	}
	 * // Some Other code which can be accessed by multiple threads.
	 * return vehicle;
	 * }
	 * 
	 */

}
