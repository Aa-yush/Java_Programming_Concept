
/* Program to understand "Concept of This Keyword"  
*
*
*This Keyword:- local/formal variable of a method overlap with the name of instance variable of the class , to differentiate between loacal/formal variable and instance variables, this keyword is used. this keyword can be used to refer to the object directly . 
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
class Test{
	private String marks;
	
		public Test(String marks){
			this.marks=marks;
		}
		public void Display(){
			System.out.println("Marks is: "+marks);
		}
}

public class This{
	public static void main(String []args){
	Test t1=new Test("99/100");
	t1.Display();
	}
}
/*
Output:-
Marks is: 99/100
*/