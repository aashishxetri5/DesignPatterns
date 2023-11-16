/**
 *
 */
package com.practice.Builder2;

/**
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Computer computer = new GamingComputerBuilder().buildCPU("Intel i9").buildRAM("Corsair 32GB")
				.buildStorage("1TB SSD").buildGraphicsCard("Nvidia RTX 3090").buildOS("Windows 11").build();

		System.out.println(computer);

		Computer computer2 = new GamingComputerBuilder().buildCPU("Intel i7").buildRAM("Corsair 12GB")
				.buildStorage("512GB SSD").buildGraphicsCard("Nvidia RTX 2080").buildOS("Windows 10").build();

		System.out.println(computer2);
	}

}
