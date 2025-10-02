package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
	
	public static void main(String[] args) {
		
		Zoo z = new Zoo();
		
		z.addAnimal(new Tiger());
		z.addAnimal(new Monkey());
		
		z.displayMenu();
	}

}
