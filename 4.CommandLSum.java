/*  Program to Take two numeric values from Command Line and than Add Its Value  
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

public class CommandLSum {
	
// An array is passing in main function which is String type
	
public static void main(String []args){
	
/* Because of integer values are bydefault String type in array, We have to convert it into Integer Type which is done by 
the Integer class which has parseInt function to convert it into integer value*/

System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1])); // Convert String into integer to Sum of two numbers 
    
	} 
}

/* Output:-
D:\JAVA Program>javac CommandLSum.java

D:\JAVA Program>java CommandLSum 2 5
7
*/