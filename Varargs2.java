/* Program :- Variable Length argument Overloading   
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
		System.out.println(" "+ a);
	}
	public void method(String str,int ... v){
		System.out.println("Length= "+v.length);
		for(int a : v)
		System.out.println(str+a+" ");
	}
	public void method(double ... v){
		System.out.println("Length= "+v.length);
		for(double a : v)
		System.out.println(" "+ a);
	}
	
	
}



class Varargs2{
	public static void main(String []args){
		Example ex=new Example();
		ex.method(12,14,65);
		ex.method("One Component=",76);
		ex.method(76.25,63.25,45.25);
	}
}

/*
Output:-
Length= 3
 12
 14
 65
Length= 1
One Component=76
Length= 3
 76.25
 63.25
 45.25

*/