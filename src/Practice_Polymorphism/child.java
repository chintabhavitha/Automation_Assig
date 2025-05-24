package Practice_Polymorphism;

public class child extends parent{

	@Override
	
	public void show() {
		System.out.println("child class");

	}
	
	public static void main(String[] args) {
		
		parent p = new child();
		p.show();
		
	}


}

//This demonstrates runtime polymorphism, where the method that gets executed is determined at runtime 
//based on the actual object (Child), even though the reference is of type Parent.

/**
 Method overiding - Run time polymorphism called method overiding, compile time polymorphism called method overloading
 
A subclass provides a specific implementation of a method already defined in its superclass.

The decision about which method to call is made at runtime.(child or parent)

Achieved through inheritance and method overriding.

**/