
/* Program to understand "Concept of Parameterized Constructor"  
*
*
*Parameterized Constructor :- If values of the instance variables are given at the time of object creation, parameterized constructors are used for this.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
class Test{
	private int rollno;
	private String marks;
	public Test(int rollno,String marks){        // Non- parameterized constructor 
		this.rollno=rollno;          //constructor Defination 
		this.marks=marks;
	}
	public void display(){
		System.out.println("Roll No is: "+rollno+"\n"+"Marks is: "+marks);
	}
}



public class ParameterizedConstructor{
	public static void main(String[] args){
		Test t1=new Test(102,"98/100");
		t1.display();
	}
}
/*
Output:-
Roll No is: 102
Marks is: 98/100 */