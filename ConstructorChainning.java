class Chainning{
	int x,y;
	public Chainning(){
		this(10,20);
	}
	public Chainning(int a){
		this(a,40);	
	}
	public Chainning(int a,int b){
		x=a;
		y=b;
	}
	public void display(){
		System.out.println("x="+x+" y="+y);
	}
	{
		System.out.println("Anomynous Block");
		
	};
	
	
}

public class ConstructorChainning{
	public static void main(String [] args){
		Chainning chain1=new Chainning();
		chain1.display();
		Chainning chain2=new Chainning(30);
		chain2.display();
		Chainning chain3=new Chainning(50,60);
		chain3.display();
	}
}

/*
Output:
x=10 y=20
x=30 y=40
x=50 y=60

*/