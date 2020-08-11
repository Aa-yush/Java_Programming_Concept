class MethodChaining{
	int fno,sno;
	
	public MethodChaining(int fno,int sno){
		this.fno=fno;
		this.sno=sno;
	}
	
	public MethodChaining add(){
		System.out.println("Addition Operation: ");
		int sum=fno+sno;
		System.out.println("Sum is:- "+sum);
		return this;		
	}
		public MethodChaining minus(){
		System.out.println("Substraction Operation: ");
		int minus=fno-sno;
		System.out.println("Substraction is:- "+minus);
		return this;		
	}
		public MethodChaining mul(){
		System.out.println("Multiplication Operation: ");
		int mul=fno*sno;
		System.out.println("Multiplication is:- "+mul);
		return this;		
	}
	
	public static void main(String [] args){
			new MethodChaining(12,5).add().minus().mul();
	}
}