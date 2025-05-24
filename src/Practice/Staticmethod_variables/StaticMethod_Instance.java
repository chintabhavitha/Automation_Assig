package Practice.Staticmethod_variables;

public class StaticMethod_Instance { 

	public  static void printMessage() {
		System.out.println("Static method in parent");
	}

//	public void show() {
//		System.out.println("Static method in parent");
//		
//	}

	public static void main(String[] args) {
		StaticMethod_Instance obj = new StaticMethod_Instance();

		// Calling static method via instance (legal but discouraged)
		obj.printMessage(); // Output: Static method in parent

		// Best practice: call using class name
		StaticMethod_Instance.printMessage(); // Output: Static method in parent
	}
	
	

}


