package Practice;

public class Staticvariable {

	public static int count = 0;
	
	public Staticvariable(){
		count ++;
		//System.out.println(count);

	}
	
	public void displaycount() {
		System.out.println("current count: " + count);
		//System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		Staticvariable obj1 = new Staticvariable();
		Staticvariable obj2 = new Staticvariable();
		Staticvariable obj3 = new Staticvariable();
		
		obj1.displaycount();
		obj2.displaycount();
		obj3.displaycount();
		
		//System.out.println(count);
	}


}

//here nothing is overriding, staticc variable used by all instances(objects), when it calls to displaycount it is printing shared value as 3