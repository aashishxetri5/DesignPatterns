/**
 *
 */
package com.practice.Builder2;

/**
 * @author asus
 */
public class GamingComputerBuilder implements ComputerBuilder {

	private String CPU;
	private String RAM;
	private String storage;
	private String graphicsCard;
	private String OS;

	@Override
	public ComputerBuilder buildCPU(String cpu) {
		this.CPU = "Gaming " + cpu;
		return this;

	}

	@Override
	public ComputerBuilder buildRAM(String ram) {
		this.RAM = "Gaming " + ram;
		return this;
	}

	@Override
	public ComputerBuilder buildGraphicsCard(String graphicsCard) {
		this.graphicsCard = "Gaming " + graphicsCard;
		return this;
	}

	@Override
	public ComputerBuilder buildStorage(String storage) {
		this.storage = "Gaming " + storage;
		return this;
	}

	@Override
	public ComputerBuilder buildOS(String os) {
		this.OS = "Gaming " + os;
		return this;
	}

	@Override
	public Computer build() {
		return new Computer(CPU, RAM, storage, graphicsCard, OS);
	}

}
