class Outer{
	private static int x=12;
	int y=20;
	public void methodOuter(){     
		System.out.println("x="+x+" y="+y);
	}
	class Inner{
		int z=25;
		public void methodInner(){
			System.out.println("x="+x+" z="+z+" y="+y);
		}
	}	
}

public  class ClassInClass{
	public static void main(String [] args){                                                                             
	Outer o=new Outer();
	o.methodOuter();
	Outer.Inner i=o.new Inner();
	i.methodInner();
		
	}
}