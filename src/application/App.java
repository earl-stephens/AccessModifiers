package application;

import package1.Person;
import package2.Employee;

public class App {

	public static void main(String[] args) {
		/* Modifier		Class	Package 	Subclass	World
		 * public		Y		Y			Y			Y
		 * protected 	Y		Y			Y			N
		 * no modifier	Y		Y			N			N
		 * private		Y		N			N			N
		 */
		
		Person person1 = new Person("Joe");
		Employee person2 = new Employee("Jane");
		//System.out.println(person1.name);
		//since Person name is public, can refer to it outside
		//class and package
		// If Person name was set to private, we could only refer
		// it within the Person class, nowhere else
		// If Person name was protected, we could only refer to it
		// in the same package (package1 in this case).  So the Person
		// class, any subclasses of Person, and any classes in package1
		// could access it.
		// If there is no modifier present, you can only refer to 
		// in the class or same package - can't access it in a 
		//subclass in a different package.
		
		// Rule is to make variables/methods as restricted as possible
		// - encapsulation
	}

}
