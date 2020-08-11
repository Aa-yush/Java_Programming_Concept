class Methods{
	public Methods firstMethod(){
		System.out.println("First Method");
		return this;
	}
	public Methods secondMethod(){
		System.out.println("Second Method");
		return this;
	}
	public Methods thirdMethod(){
		System.out.println("Third Method");
		return this;
	}
}

public class MethodChainning{
	public static void main(String[] args){
		new Methods().firstMethod().secondMethod().thirdMethod();
	}
}

/*
Output:
First Method
Second Method
Third Method
*/