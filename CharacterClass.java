/* Program :-Character Class and its methods   
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

public class CharacterClass{
	public static void main(String[] args){
		Character ch1=new Character('a');
		Character ch2=new Character('A');
		int difference=ch1.compareTo(ch2);
		System.out.println(difference);
		boolean check = ch1.equals(ch2);
		System.out.println(check);
		String s=new String("Ayush");
		System.out.println(s);
		s="Ayush Gupta";
		System.out.println(s);
		
	}
}

/*
output:-
32
false
Ayush
Ayush Gupta

*/