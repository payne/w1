package org.mattpayne.web.w1;

public class Person {

	String name;
	int attendanceCount;

	public Person() {
	}

	public Person(String name, int attendanceCount) {
		super();
		this.name = name;
		this.attendanceCount = attendanceCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttendanceCount() {
		return attendanceCount;
	}

	public void setAttendanceCount(int attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

}
