
import java.util.Scanner;
class NestedIf{
	public int check(int f,int s,int t){
		if(f>s)
			if(f>t)
				return f;
			else
				return t;
		else 
			if(s>t)
				return s;
			else
				return t;
	}
	
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c=sc.nextInt();
		NestedIf ni=new NestedIf();
		int ans=ni.check(a,b,c);
		System.out.println("Greatest Number is :"+ans);
		}
}