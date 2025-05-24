package Practice.Staticmethod_variables;

public class childClass extends parentStaticMethodInInheritace {

    public static void show() {
        System.out.println("Static method in Child1");

       
    }

    public static void main(String[] args) {
    	parentStaticMethodInInheritace p = new childClass();

        p.show1();  // Output: Static method in parent1
        // p.show(); //  Won't compile if uncommented because the reference type (staticMethodInInheritace) doesn’t know about show()
        
        childClass c = new childClass();  //here childclass know about show1() and show() because it inherits from staticMethodInInheritace(parent)
        c.show1();  // Output: Static method in parent1
        c.show();   //Output: Static method in child1
    }
}


//Even though p refers to a Child object, the type of the reference is Parent. 
//And static methods are resolved at compile time, not at runtime like instance methods. 
//So Java looks at the reference type, not the object type.

//This is called method hiding, not overriding