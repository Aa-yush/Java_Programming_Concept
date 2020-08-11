import java.util.*;

class FabonacciSeries{
	public void Series(){
		Scanner sc=new Scanner(System.in);
		System.out.print("How many number of terms in series: ");
		int terms=sc.nextInt();
		int f=0,s=1,t;
		
		while(terms>0){
		t=f+s;
		System.out.print(t+" ");
		f=s;
		s=t;
		--terms;
		}
		
	}
	
	public static void main(String [] args){
		FabonacciSeries fs=new FabonacciSeries();
		fs.Series();
	}
}