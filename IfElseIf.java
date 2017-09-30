/*  Program  To Understand the concept of iF-else if  
*
*
* else if- It execute a statement based on the another expression. "If statement" can have any number of companion else if statement but at the end , only one else part will be there . 
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.util.*;

public class IfElseIf {
	
	public static void main ( String [] args ){
		
		Scanner sc = new Scanner ( System.in );
		System.out.print ( "Enter Number of Month: " );
		int a = sc.nextInt();
		if( a == 1 )
			System.out.println("January");
		else if ( a == 2 )
			System.out.println("February");
		else if ( a == 3 )
			System.out.println("March");
		else if ( a == 4 )
			System.out.println("April");
		else if ( a == 5 )
			System.out.println("May");
		else if ( a == 6 )
			System.out.println("June");
		else if ( a == 7 )
			System.out.println("July");
		else if ( a == 8 )
			System.out.println("August");
		else if ( a == 9 )
			System.out.println("September");
		else if ( a == 10 )
			System.out.println("October");
		else if ( a == 11 )
			System.out.println("November");
		else if ( a == 12 )
			System.out.println("December");
		else
			System.out.println("Wrong Month Number");
	}
}

/*

Output:-
Enter Number of Month: 9
September

*/