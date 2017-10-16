/*  Program  To Understand the concept of Interface  
*
*  - More than one interface can be implemented in a single class
*
*  - define a protocol of behaviour that can be implemented by any class anywhere in 
		the class hierarchy 
*		
*   -provide similarties among unrelated classes without artificially forcing a class 
		relationship
*
*	- declare methods that one or more classes are expected to implement
* 
*   - we cannot intantiate an interface
*
*   - All of the methods in an interface are abstract and public
* 
*   -An interface is not extended by a class; It is implemented by a class
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

interface Function{
	public int add(int a,int b);
	public int sub(int a,int b);
	public int mul(int a,int b);
	public int div(int a,int b);
}
class Calculation implements Function{
	private int a;
	private int b;
	
	public int add(int a ,int b){
		return(a+b);
	}
	public int sub(int a ,int b){
		return(a-b);
	}
	public int mul(int a ,int b){
		return(a*b);
	}
	public int div(int a ,int b){
		return(a/b);
	}
	public void display(){
		System.out.println("Addition is: "+add(6,2));
		System.out.println("Substraction is: "+sub(6,2));
		System.out.println("Multiplication is: "+mul(6,2));
		System.out.println("Division is: "+div(6,2));
	}
}
public class Interface{
	public static void main(String[] args){
		Calculation c1=new Calculation();		
		c1.display();
		
	}
}
/*
Output:-
Addition is: 8
Substraction is: 4
Multiplication is: 12
Division is: 3
*/