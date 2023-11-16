package com.practice.Builder2;

/**
 * @author asus
 */
public interface ComputerBuilder {

	ComputerBuilder buildCPU(String cpu);

	ComputerBuilder buildRAM(String ram);

	ComputerBuilder buildGraphicsCard(String graphicsCard);

	ComputerBuilder buildStorage(String storage);
	
	ComputerBuilder buildOS(String os);
	
	Computer build();

}
