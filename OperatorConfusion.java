public class OperatorConfusion{
	public static void main(String [] args ){
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println(s1==s2); // They belongs to same reference
		System.out.println(s1==s3); // They doesnt belong to same reference 		 
		System.out.println(s1.equals(s3)); // It checks for content equality
	}
}

/*
Output:

true
false
true

*/