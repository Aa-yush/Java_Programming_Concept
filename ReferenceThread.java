
/* Program to understand "Reference of Thread"  
* 
*Reference of Thread: We can obtain a reference to thread class object by calling the method currentThread() which is a static method.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

public class ReferenceThread{
	public static void main(String[] args){
		Thread thref=Thread.currentThread();  // obtaining the reference of thread class
		System.out.println("Current Thread = "+thref);
	}
}
/*
Output:-
Current Thread = Thread[main,5,main]
*/