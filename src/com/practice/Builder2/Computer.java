/**
 *
 */
package com.practice.Builder2;

/**
 * @author asus
 */
public class Computer {

	private String CPU;
	private String RAM;
	private String storage;
	private String graphicsCard;
	private String OS;

	Computer(String cpu, String ram, String storage, String graphicsCard, String os) {
		this.CPU = cpu;
		this.RAM = ram;
		this.storage = storage;
		this.graphicsCard = graphicsCard;
		this.OS = os;
	}

	/**
	 * @return the CPU
	 */
	public String getCPU() {
		return CPU;
	}

	/**
	 * @return the RAM
	 */
	public String getRAM() {
		return RAM;
	}

	/**
	 * @return the storage
	 */
	public String getStorage() {
		return storage;
	}

	/**
	 * @return the graphicsCard
	 */
	public String getGraphicsCard() {
		return graphicsCard;
	}

	/**
	 * @return the OS
	 */
	public String getOS() {
		return OS;
	}

	@Override
	public String toString() {
		return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", graphicsCard=" + graphicsCard
				+ ", OS=" + OS + "]";
	}

}
