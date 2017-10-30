
/* Program to understand "Concept of StringBuffer Methods"  
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

public class StringBufferMethod{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer("Java Programming");
		System.out.println(sb.capacity()); // total allocated capacity of String buffer
		System.out.println(sb.length()); // number of characters
		sb.setLength(9);  // truncate string allowing only 9 characters
		System.out.println(sb);  // print truncated string
		System.out.println(sb.append("gramming based on oops")); /* append string to 
																	truncate string*/
		System.out.println(sb.reverse()); // reverse String
		System.out.println(sb.deleteCharAt(6)); // delete character at particular index
		System.out.println(sb.replace(0,5,"Ayush")); // replace start-end from "Ayush"
		System.out.println(sb.delete(5,31)); // delete character from start-end
		System.out.println(sb.insert(5," is a good Boy"));
	}
}
/*
OutPut:-
32
16
Java Prog
Java Proggramming based on oops
spoo no desab gnimmarggorP avaJ
spoo n desab gnimmarggorP avaJ
Ayushn desab gnimmarggorP avaJ
Ayush
Ayush is a good Boy
*/