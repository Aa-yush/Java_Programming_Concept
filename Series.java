import java.util.Scanner;

class Series{
	public static void main(String[] args){
		int i=2,tot=0,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of x: ");
		int x=sc.nextInt();
		System.out.print("Enter power : ");
		int power=sc.nextInt();
		
		
		while(power>=i){   // for calculate power of a given number
			if(i==2)
				tot=x*x;
			else
				tot=tot*x;
			
			++i;
		}
		for(int a=power;a>=1;a--) // calculate factorial
			fact=fact*a;
		
		float result=(float)tot/fact;
		System.out.println("Result: "+result);
		
		
	}
}