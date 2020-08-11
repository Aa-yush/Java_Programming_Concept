class PrefixPostfix{
	public void prefix(){
		int x=5;
		int y=++x;
		System.out.println("Value of y(prefix) :"+y);
	}
	public void postfix(){
		int x=5;
		int y=x++;
		System.out.println("Value of y(postfix) :"+y);
		y=x+1;
		System.out.println("Value of y(x add 1) :"+y);
		
	}
	public static void main(String[] args){
		PrefixPostfix pp=new PrefixPostfix();
		pp.prefix();
		pp.postfix();
		
	}
}