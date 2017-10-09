/* Program to understand "Concept of Return Object"  
*
*
*
* Returning Object : An object returned from a method can be stored in any other object of that class
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
class Test{
	private String name;
	private int marks1;
	private int marks2;
	private double result;
	
	public Test(String name,int marks1,int marks2){
		this.name=name;
		this.marks1=marks1;
		this.marks2=marks2;
	}
	public Test setResult(Test t){
		result=(t.marks1+t.marks2)/2;
		return t;    // returning Object 
	}
	public void display(){
		System.out.println("Name is: "+name);
		System.out.println("Marks1 is: "+marks1);
		System.out.println("Marks2 is: "+marks2);
		System.out.println("Result is: "+result+"%");
		
	}
}


public class ReturnObject{
	public static void main(String [] args){
		Test t1=new Test("Ayush Gupta",75,88);		
		Test t2 = t1.setResult(t1);  // retruned object stored in t2 reference variable
		t2.display();
		}
}
/*
Output:-
Name is: Ayush Gupta
Marks1 is: 75
Marks2 is: 88
Result is: 81.0%
*/