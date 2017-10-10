/* Program to understand "Concept of Abstract Class"  
*
*
*
* Abstract Class:- Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
			-But, if a class has at least one abstract method, then the class must be declared abstract.
			
			-If a class is declared abstract, it cannot be instantiated.
			
			-To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
			
			-If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

abstract class Sum{                       // Abstract Class
	protected int a;
	protected int b;
	public void set_Values(int a,int b){
		this.a=a;
		this.b=b;
	}
	public abstract void sum();  // Abstract Method
}
class Calculate extends Sum{
	public void sum(){
		System.out.println("Sum is :"+(a+b));
	}
}

public class AbstractDemo{
	public static void main(String[] args){
		Calculate c1=new Calculate();
		c1.set_Values(5,7);
		c1.sum();
	}
}
/*
Output:-
Sum is :12
*/