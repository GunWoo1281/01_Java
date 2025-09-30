package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car{

	private int batterCapacity;
	
	public Tesla() {
	
	}

	public Tesla(String engine, String fuel, int wheel, int batterCapacity) {
		super(engine, fuel, wheel);
		this.batterCapacity = batterCapacity;
	}

	public int getBatterCapacity() {
		return batterCapacity;
	}

	public void setBatterCapacity(int batterCapacity) {
		this.batterCapacity = batterCapacity;
	}

	@Override
	public String toString() {
		return super.toString() + "/" + batterCapacity;
	}
	
}
