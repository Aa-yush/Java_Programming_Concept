/* Program to understand "Concept of For-loop"  
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

public class ForLoop {
	
	public static void main ( String []args ) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print ( "Enter a Number: " );
		int num=sc.nextInt();
		
		for ( int i=1 ;i<=10 ;i++ )  /* initalize i starting from 1 until 
		                                 less than or equal to 10 and i increment by 1 */
			System.out.println ( num +" * "+i+" = "+(num*i));
	}
}

/*OutPut:-
Enter a Number: 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50*/