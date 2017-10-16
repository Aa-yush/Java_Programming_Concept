
/* Program to understand "Finally Block"  
*
*Finally Block: A finally clause is included in a program in the last after all the possible code to be executed .Basically finally block should be the last block of execution in the program .
*
*	- Using a finally block allows you to run any cleanup type statements that you want 
		to execute ,no matter what happens in the protected code.
*	- At least one clause ,either catch or finally must be associated with each try block
*
*
*
*/

public class FinallyBlock{
	public static void main(String[] args){
		int arr[]={10,20,30,40};
		try{
		for(int i=0;i<=arr.length;i++)
			System.out.println("Value"+i+"= "+arr[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("***Now Array Index out of Range***");
		}
		finally{
			System.out.println("You are in now Finally Block");
		}
	}
}
/*
OutPut:-
Value0= 10
Value1= 20
Value2= 30
Value3= 40
***Now Array Index out of Range***
You are in now Finally Block
*/