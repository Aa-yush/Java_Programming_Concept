/*  Program  To Understand the concept of Inheritance
*
*
* Inheritance- the process where one class acquires the properties (Methods and fields) of another 
*
* extend keyword- extends is the keyword used to inherit the properties of a class.
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
class Calculation{
	protected int a;
	protected int b;
	
	public int addition(int a,int b){
		return (a+b);
	}
	public int subtraction(int a,int b){
		return (a-b);
	}
}

class Calculation1 extends Calculation{
	public int multiplication(int a,int b){
		return (a*b);
	}
	public int division(int a,int b){
		return (a/b);
	}
}

public class Inheritance{
	public static void main(String []args){
		Calculation1 c1=new Calculation1();
		System.out.println("Addition is: "+c1.addition(10,30));
		System.out.println("Subtraction is: "+c1.subtraction(70,20));
		System.out.println("Multiplication is: "+c1.multiplication(20,4));
		System.out.println("Division is: "+c1.division(50,5));
	}
}
/*
OutPut:-
Addition is: 40
Subtraction is: 50
Multiplication is: 80
Division is: 10
*/