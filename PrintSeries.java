import java.util.Scanner;

class PrintSeries{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		float num=1,fact=1,sum=0;
		System.out.print("Enter value of x: ");
		float x=sc.nextFloat();
		System.out.print("Enter number of terms: ");
		float terms=sc.nextFloat();
		
		for(int i=1;i<terms;i++){
			num=num*x;
		for(int j=1;j<=i;j++){
			fact=fact*j;	
		}
		sum=sum+(num/fact);
		fact=1;
		}
		System.out.println("Series Result : "+(sum+1));
	}
}