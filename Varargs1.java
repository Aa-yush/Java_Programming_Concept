/* Program :- Variable Length argument Concept  
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

class Example{
	public void method(int ... v){
		System.out.println("Length= "+v.length);
		for(int a : v)
		System.out.print(" "+ a);
	}
	
	
}

/*
Output:-
Length= 3
 12 14 65
*/



class Varargs1{
	public static void main(String []args){
		Example ex=new Example();
		ex.method(12,14,65);
	}
}