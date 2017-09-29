/*  Program To understand the Concept of Switch-Case: 
*
*Switch Statement: Java has a build in multiway decision statement known as switch statement. The switch statement is used to conditionally perform statements based on an expression.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/
import java.util.*;

public class SwitchCase {
	public static void main ( String args[] ) {   // main function
	
		Scanner sc = new Scanner ( System.in );   // object of scanner class
		String ans = null;  
		do {                                       //do-while loop
		
		System.out.print ( "Enter First Number: " );
		int a = sc.nextInt();                          // input First number
		System.out.print ( "Enter Second Number: " );
		int b = sc.nextInt();                          // input First number
		sc.nextLine();     // Telling compiler that next Input is String 
		System.out.print ( "Enter Operator (+,-,*,/): " );
		String ch = sc.nextLine();    // Input operator as String   
		switch( ch ){                   // switch statment with String variable 
		/*		

        You can have any number of case statements within a switch. Each case is        followed by the value to be compared to and a colon. 

		When the variable being switched on is equal to a case, the statements
		following that case will execute until a break statement is reached.

        When a break statement is reached, the switch terminates

        */
			
			case "+" : System.out.println ( "Sum is: " + (a+b) );   
			           break;
			case "-" : System.out.println ( "Substraction is: " + (a-b) );
			           break;
			case "*" : System.out.println ( "Multiplication is: " + (a*b) );
			           break;
			case "/" : System.out.println ( "Division is: "+(a/b) );
			           break;
            default : System.out.println ( "Wrong choice" );			
		
		}
		
		System.out.print ( "Do you want to continue(y/n): " ) ;
		ans = sc.nextLine();
		}while ( ans.equals("y") || ans.equals("Y") );
	}
}


/*

Enter First Number: 12
Enter Second Number: 12
Enter Operator (+,-,*,/): +
Sum is: 24
Do you want to continue(y/n): y
Enter First Number: 15
Enter Second Number: 5
Enter Operator (+,-,*,/): -
Substraction is: 10
Do you want to continue(y/n):

*/