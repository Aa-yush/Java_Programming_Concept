
/* Program :- Abstract Class Contains Constructor    
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

abstract class Multiply{
	 int a;
	 int b;
	public Multiply(){
		a=10;
		b=10;
	}
	public abstract void multiply();
}

class SubClass extends Multiply{
	public void multiply(){
	System.out.println("Multiplication is : "+(a*b));	
	}
}
public class AbsConstructor{
	public static void main(String [] args ){
		SubClass mul=new SubClass();
		mul.multiply();
	}
}

/*
Output:
Multiplication is : 100
*/