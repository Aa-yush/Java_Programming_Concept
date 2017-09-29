
/* Program to understand "Concept of While Loop"  
*
*
*While:- A while statement is used to continually execute a block of statements Provided a condition remains true.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.util.*;

public class While {
	
	public static void main ( String []args ) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print ( "Enter a Number: " );
		int num=sc.nextInt();
		int i=1;
		while(i<=10){             // Condition check 
					
			System.out.println ( num +" * "+i+" = "+(num*i));
			i++;
			
			}
			
			
	}
}