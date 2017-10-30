
/* Program to understand "Concept of Character Method"  
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

public class CharacterMethods{
	public static void main(String []args){
		Character c1= new Character('a');
		Character c2 = new Character('A');
		System.out.println(c1.charValue()); // return the value held by object
		System.out.println(c1.compareTo(c2)); // compare difference of two character
		System.out.println(c1.equals(c2));  // checking eqauality
		System.out.println(c1.isUpperCase('C')); // checking character is uppercase or not
		
	}
}