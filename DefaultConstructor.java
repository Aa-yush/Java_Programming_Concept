
/* Program to understand "Concept of Default Constructor"  
*
*
*Default Constructor :- Every class has a constructor . If we do not explicitly write a constructor for a class , the java compiler build a default constructor for that class.
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
	private int marks;
	public Test(){
		 // Default Constructor 
	}
}



public class DefaultConstructor{
	public static void main(String[] args){
		Test t1=new Test();
	}
}