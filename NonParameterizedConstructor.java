
/* Program to understand "Concept of Non-Parameterized Constructor"  
*
*
*Non-Parameterized Constructor :- is used for object creation instance variable of the object initialized by fixed values at the time of defination of constructor itself.
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
	public Test(){        // Non- parameterized constructor 
		rollno=102;          //constructor Defination 
		marks="98/100";
	}
	public void display(){
		System.out.println("Roll No is: "+rollno+"\n"+"Marks is: "+marks);
	}
}



public class NonParameterizedConstructor{
	public static void main(String[] args){
		Test t1=new Test();
		t1.display();
	}
}

/*
Output:-
Roll No is: 102
Marks is: 98/100 */