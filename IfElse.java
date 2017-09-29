/* Program to understand "Concept of if-else"  
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.util.*;

public class IfElse {
	
	public static void main ( String []args ) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print ( "Enter a Number: " );
		int num=sc.nextInt();
		
		if(num%2==0)     // Condition check whether a number is Odd or Even
			System.out.println("**Number is Even**");  // if condition is true
		else
			System.out.println("**Number is Odd**");   // if Condition False 
		
	}
}

/* OutPut:
        Enter a Number: 12				Enter a Number: 3
		**Number is Even**				**Number is Odd**     */