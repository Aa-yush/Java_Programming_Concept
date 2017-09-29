/* Program to understand "How to Take Input From User"    
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

import java.util.*; // import keyword is used to import classes of other pakages

public class Input {
	
	public static void main ( String[] args ) {
		
/*    -We can read java input from System.in using Scanner class.
      -Scanner class is a part of java.util pakage  */
	  
		Scanner sc=new Scanner(System.in);     // Making object of Scanner class
		
		System.out.print("Enter a Number: ");
		
		          
		int num=sc.nextInt();   /* Reference variable of class Scanner call its method nextInt() 
				                which takes input of integer type */

 		
		sc.nextLine();  /*This command is used to tell compiler that next Input
						will be String Otherwise by default it assume as integer type */
		
		System.out.print("Enter your Name: ");
		
		          
		String name=sc.nextLine(); /* Reference variable of class Scanner call its method nextLine() 
		                        which takes input of String type (inlcluding space also)*/
		
		System.out.print("Enter your Father's Name: ");
		          
		String fname=sc.next();  /* Reference variable of class Scanner call its method next() 
		                             which takes input of String type (Not Including space)*/
								
		
		System.out.println("Number is: "+num);     // print Number 
		System.out.println("Your name is: "+name); // print Name  
		System.out.println("Your Father's name: "+fname); // print Father's Name 
		}
}


/* Output:- 
Enter a Number: 12
Enter your Name: Sandeep Gupta
Enter your Father's Name: Naksh Gupta
Number is: 12
Your name is: Sandeep Gupta
Your Father's name: Naksh
		*/
			