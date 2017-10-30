
/* Program to understand "Thread Using implements Runnable Interface "  
*
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

class Example implements Runnable{
	public void run(){
			for(int i=1;i<=10;i++)
				System.out.println("Thread ="+i);
		}
}

public class ThreadInterface{
	public static void main(String[] args){
		Thread t1=new Thread(new Example());
		t1.start();
	}
}
/*
OutPut:-
Thread =1
Thread =2
Thread =3
Thread =4
Thread =5
Thread =6
Thread =7
Thread =8
Thread =9
Thread =10
*/