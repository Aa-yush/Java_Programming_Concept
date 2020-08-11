class Abc{
	double l;
	double b;
	double h;
	
	Abc(double l,double b,double h){
		this.l=l;
		this.b=b;
		this.h=h;		
	}
	public String toString(){
		return "Dimention :"+l+" and "+b+" and "+h;
	}
	public static void main(String [] args ){
		Abc a=new Abc(10,21,43);
		System.out.println(a); // compiler writes a.toString() 
	}
}

/*
Output:
Abc@6073f712 -> it will write hashcode of object without override to String method 
Dimention :10.0 and 21.0 and 43.0 ->  when override toString method
*/