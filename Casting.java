class Casting{
	public static void main(String [] args){
		
		char ch='a';
		System.out.println("value of ch:"+ch);
		
		int in=ch; // upcasting
		System.out.println("value of in:"+in);
		
		int i=20;
		char ch1=(char)i; //downcasting
		System.out.println("value of ch1:"+ch1);
	}
}
/*
Output:
value of ch:a
value of in:97
value of ch1:

*/