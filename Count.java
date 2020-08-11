class Count{
	static int count=0;
	{
		count++;	
	};
	public Count(){
		
	}
	public Count(int a){
		
	}
	public Count(int a,int b){
		
	}
	public static void main(String[] args){
		Count co=new Count();
		Count co1=new Count(2);
		Count co2=new Count(3);
		Count co3=new Count();
		System.out.println("Number of constructor invoked: "+count);
	}
}