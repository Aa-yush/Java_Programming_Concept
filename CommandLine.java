/*  Program  To Take input From Command Line and than Print Its Value  
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

public class CommandLine {
	
// An array is passing in main function which is String type
 
	public static void main ( String[] args ){

// Loop: include all String !! Lenght is the property by which we get to know how much elements in array exist!! 

    for ( int i=0; i<args.length ;i++ )
		
// command line argument receives string during run time
 
         System.out.println ( args[i] );   
	}
}
/* OutPut:-
               
D:\Ayush's Folder\JAVA\JAVA Program>javac CommandLine.java

D:\Ayush's Folder\JAVA\JAVA Program>java CommandLine Ayush_Gupta Semma_Chauhan Anita_Kumari
Ayush_Gupta
Semma_Chauhan
Anita_Kumari

*/
	