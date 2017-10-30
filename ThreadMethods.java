
/* Program to understand "List of Thread Methods"  
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

public class ThreadMethods{
	public static void main(String[] args){
		Thread thref=Thread.currentThread();  // obtaining the reference of thread class
		System.out.println("Current Thread :"+thref);
		System.out.println("Current Thread Name: "+thref.getName());  // get_thread_name
		thref.setName("First Time");  // set thread Name as "First Time"
		System.out.println("After Thread Name Change: "+thref.getName());
		System.out.println("Current Priority : "+thref.getPriority());//get_priority
		thref.setPriority(10); //set priority
		System.out.println("After Priority Change : "+thref.getPriority());
		System.out.println("Thread Alive? = "+thref.isAlive());  // check thread alive
		
		//Available for background process ?? retrun boolean
		System.out.println("Thread Daemon? = "+thref.isDaemon()); 
	}
}
/*
OutPut:- 
Current Thread :Thread[main,5,main]
Current Thread Name: main
After Thread Name Change: First Time
Current Priority : 5
After Priority Change : 10
Thread Alive? = true
Thread Daemon? = false
*/