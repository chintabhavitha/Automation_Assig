package Practice.Staticmethod_variables;

import Practice.Staticvariable;

public class staticVariable {

	public static int count = 0;

	public staticVariable() {

		count++;
		
		System.out.println(count);
		
	}
	

	public static void main(String[] args) {
		Staticvariable obj = new Staticvariable();
		Staticvariable obj1 = new Staticvariable();
		
		obj.displaycount();
		obj1.displaycount();
		
//		System.out.println(count);

	}

}
