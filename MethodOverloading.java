public class MethodOverloading{
	public void test(){
		System.out.println("No parameters");
	}
	public void test(int a){
		System.out.println("Single parameter");
	}
	public void test(double b){
		System.out.println("double type parameter");
	}
	public void test(int c,double d){
		System.out.println("Two parameterized");
	}
	public static void main(String [] args){
		MethodOverloading mo=new MethodOverloading();
		mo.test(); 
		mo.test(20);
		mo.test(19.5);
		mo.test(20,19.5);
	}
}

/* Output :-

No parameters
Single parameter
double type parameter
Two parameterized

*/