public class ConsOverload{
	int width;
	int height;
	int depth;
	
	public ConsOverload(){
		width=-1;
		height=-1;
		depth=-1;
	}
	public ConsOverload(int width,int height){
		this.width=width;
		this.height=height;
		depth=22;
	}
	public ConsOverload(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public void display(){
		System.out.println("Width="+width+" Height="+height+" Depth="+depth);
	}
	public static void main(String [] args){
		ConsOverload co=new ConsOverload();
		ConsOverload co1=new ConsOverload(11,21);
		ConsOverload co2=new ConsOverload(12,12,12);
		co.display();
		co1.display();
		co2.display();
	}
}