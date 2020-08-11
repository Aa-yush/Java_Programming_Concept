class ExceptionDemo extends Exception{
	private int detail;
	
	public ExceptionDemo(int a){
		detail=a;
	}
	
	public String toString(){
		return "Exception["+detail+"]";
	}
}


class MyException {
	public static void compute(int a) throws ExceptionDemo{
		System.out.println("Value is["+a+"]");
		if(a>10)
			throw new ExceptionDemo(a);
		System.out.println("Value is less than 10");
	}
	
	public static void main(String[] args){
		try{
		compute(2);
		compute(20);
		}catch(ExceptionDemo e){
			System.out.println(e);
		}
	}
}

/*
Output:-

Value is[2]
Value is less than 10
Value is[20]
Exception[20]

*/