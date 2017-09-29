
/* Program to understand "Concept of Do_While Loop"  
*
*
*Do-while:- The do while evaluates the expression at the botton instead of evalating it at the top of the loop. Thus the code block associate with a do-while is executed at least once.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.util.*;

public class DoWhile {
	
	public static void main ( String []args ) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print ( "Enter a Number: " );
		int num=sc.nextInt();
		int i=1;
		do{
			
			/*before checking condition it execute atleast once*/
			
			System.out.println ( num +" * "+i+" = "+(num*i));  
			
			i++; // increment i;
			
		}while(i<=10);  // at last condition check
			
	}
}