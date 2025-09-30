package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone sph = new SmartPhone();
		
		sph.setBrand("Samsung");	
		sph.setModel("Galaxy S20");	
		sph.setYear(2020);	
		sph.setPrice(1200000);
		sph.setOperatingSystem("Android");	
		sph.setStorageCapacity(128);	
		sph.printInfo();
		
		System.out.println("================");
		BasicPhone bph = new BasicPhone();
		bph.setBrand("Nokia");
		bph.setModel("3310");
		bph.setYear(2000);
		bph.setPrice(100000);
		bph.setHasPhysicalKeyboard(true);
		
		bph.printInfo();
		bph.checkKeyboard();
	}

}
