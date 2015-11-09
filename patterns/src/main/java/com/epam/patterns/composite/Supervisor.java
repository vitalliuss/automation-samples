package com.epam.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Employee {

	private String name;
	private int happiness;

	private List<Employee> subordinate = new ArrayList<Employee>();

	public Supervisor(String name, int happiness) {
		this.name = name;
		this.happiness = happiness;
	}

	public void showHappiness() {
		System.out.println(name + " showed happiness level of " + happiness);
		// show all the subordinate's happiness level
		for (Employee e : subordinate)
			e.showHappiness();
	}

	public void addSubordinate(Employee employee) {
		subordinate.add(employee);
	}
}
