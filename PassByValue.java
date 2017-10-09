/* Program to understand "Concept of Using Object as Parameters"  
*
*
*
* PassByValue :when you call a method a copy of each of the actual parameter is passed to the method  
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/


class MaxMarks{
	private int marks1;
	private int marks2;
	public MaxMarks(int marks1,int marks2){
		if(marks1>marks2)
			System.out.println("Maximum Marks is: "+marks1);
		else
			System.out.println("Maximum Marks is: "+marks2);
	}
}

public class PassByValue{
	public static void main(String[] args ){
		MaxMarks m1=new MaxMarks(99,95);		
	}
}
/*
OutPut:-
Maximum Marks is: 99
*/