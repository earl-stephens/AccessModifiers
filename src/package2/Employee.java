package package2;

import package1.Person;

public class Employee extends Person {
	
	public Employee(String name) {
		super(name);
		
		System.out.println(this.name);
		//name refers to the protected variable in the super class.
		//Since Employee is a subclass of Person, it can access name
		//even though Employee is in a different package.
	}
}
