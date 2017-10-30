
/* Program to understand "How Thread Works"  
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

class A implements Runnable{
	public void run(){		// the run methods is invoked on the runnable object
		try{
		for(int a=1;a<=10;a++){
			Thread.sleep(100);   // sleep its working for 100ms
			System.out.println("Thread A");
		}
		}catch(Exception e){}
	}
}
class B implements Runnable{
	public void run(){      // the run methods is invoked on the runnable object     
		try{
		for(int a=1;a<=10;a++){
			Thread.sleep(1000);    // sleep its working for 1000ms
			System.out.println("Thread B");
		}
		}catch(Exception e){}
		}
	}

public class ThreadWorking{
	public static void main(String[] args){
	Thread t1=new Thread(new A());   // thread object having class A object
	Thread t2=new Thread(new B());	 // thread object having class B object
	t1.start();     // start thread for class A , it invokes run method
	t2.start();     // start thread for class B , it invokes run method
	}
}

/*
Output:-
Thread A
Thread A
Thread A
Thread A
Thread A
Thread A
Thread A
Thread A
Thread A
Thread B
Thread A
Thread B
Thread B
Thread B
Thread B
Thread B
Thread B
Thread B
Thread B
Thread B
*/