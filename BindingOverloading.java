class BindingOverloading{
	public static void method(){
		System.out.println("Default");
	}
	public static void method(int a){
		System.out.println("One Parameterized");
	}
	public static void method(int a,int b){
		System.out.println("Two Parameterized");
	}
	public static void main(String[] args){
		BindingOverloading bo=new BindingOverloading();
		bo.method(2);
	}
}