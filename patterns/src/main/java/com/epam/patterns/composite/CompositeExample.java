package com.epam.patterns.composite;

public class CompositeExample {

	public static void main(String[] args) {
		Worker worker1 = new Worker("Worker Tom", 5);
		Supervisor supervisorMary = new Supervisor("Supervisor Mary", 6);
		Supervisor supervisorJerry = new Supervisor("Supervisor Jerry", 7);
		Supervisor supervisorBob = new Supervisor("Supervisor Bob", 9);
		Worker worker2 = new Worker("Worker Jimmy", 8);
		
		// set up the relationships
		supervisorMary.addSubordinate(worker1); // Tom works for Mary
		supervisorJerry.addSubordinate(supervisorMary); // Mary works for Jerry
		supervisorJerry.addSubordinate(supervisorBob); // Bob works for Jerry
		supervisorBob.addSubordinate(worker2); // Jimmy works for Bob

		// Jerry shows his happiness and asks everyone else to do the same		
		supervisorJerry.showHappiness();

	}

}
