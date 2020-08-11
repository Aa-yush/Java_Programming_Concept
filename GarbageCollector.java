

public class GarbageCollector{
	public static void main(String [] args){
		GarbageCollector kb = new GarbageCollector();
		kb=null;
		System.gc();
		
	
	}
	protected void finalize(){
		 System.out.println("It runs everytime when gc() invoked");
	 }
}