
/* Program to understand "Concept of String Methods"  
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

public class StringMethods{
	public static void main(String []args){
		String st=new String("Aayush is Great!!");
		System.out.println(st); // Print String
		System.out.println(st.length()); // return length of String
		System.out.println(st.indexOf(104));  // 104 is 'h' return index
		System.out.println(st.replace('a','s')); // replace a->s
		System.out.println(st.toLowerCase()); // convert in Lowercase
		System.out.println(st.toUpperCase()); // convert in Uppercase
		
	}
}