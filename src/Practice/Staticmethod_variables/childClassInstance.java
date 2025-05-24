package Practice.Staticmethod_variables;

public class childClassInstance extends StaticMethod_Instance {

	//@Override
	
	public void show() {
		System.out.println("static method in child");

	}

	public static void main(String[] args) {

		StaticMethod_Instance p = new childClassInstance(); //here childclass know about printmessage() and show() because it inherits from StaticMethod_Instance(parent)
		
		//p.show(); //static method in child
		p.printMessage(); //static method in parent
	}
}
