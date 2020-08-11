public class FinalKeyword{
	static final int a;
	final int b;
	static{
		a=10;	
		System.out.println("Initialized final static datamember using static block");
	}
	public FinalKeyword(){
		b=15;
		System.out.println("Initialized final datamember using constructor ");
	}
	public static void main(String [] args){
		FinalKeyword fk=new FinalKeyword();
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+fk.b);
	}
}