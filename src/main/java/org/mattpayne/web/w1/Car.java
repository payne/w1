package org.mattpayne.web.w1;

public class Car {

	private String color;
	private String type;
	
	public Car(String c, String t) {
		this.color = c;
		this.type = t;
	}
	
	public Car() {}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// standard getters setters
}