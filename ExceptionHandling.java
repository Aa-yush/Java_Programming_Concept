
/* Program to understand "Exception handling"  
*
*Exception Handling: Exception in java are handled by the use of these five: 			
*			try,catch,throw,throws,and finally. 
*
*   -We have to put those statements of program on which you want to monitor for 
*		exception, in try block.
*
*   -If any exceptions occur that will be catched using catch.
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

public class ExceptionHandling{
	public static void main(String[] args){
		int arr[]={10,20,30,40};
		try{
		for(int i=0;i<=arr.length;i++)
			System.out.println("Value"+i+"= "+arr[i]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("***Now Array Index out of Range***");
		}
	}
}

/*
Exception OutPut:-
Value0= 10
Value1= 20
Value2= 30
Value3= 40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at ExceptionHandling.main(ExceptionHandling.java:5)
		
		
	Exception Handling Output:-
		Value0= 10
		Value1= 20
		Value2= 30
		Value3= 40
		***Now Array Index out of Range***
*/