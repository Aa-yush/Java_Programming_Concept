// Example of synchronization which works properly

class Function{
	public void func(){
		for(int i=0;i<=5;i++)
			System.out.println("Value is: "+i);
	}
}

class FromHere extends Thread{
	private Function f1;
	private String str;
	
	public FromHere(Function f,String st){
		f1=f;
		str=st;
	}
	public void run(){
			synchronized(f1){
			System.out.println(str+" is starting");
			f1.func();
			System.out.println(str+" is end");	
			}			
	}
}
class Synchro{
	public static void main(String[] args){
		Function ft=new Function();
		FromHere fh=new FromHere(ft,"Thread-1");
		FromHere fh2=new FromHere(ft,"Thread-2");
		
		fh.start();
		fh2.start();
	}
}