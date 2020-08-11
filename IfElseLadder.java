
import java.util.Scanner;
class IfElseLadder{
	public void cal(float bs){
		float ta=0,da=0,hra=0,gs=0;
		if(bs>=60000&&bs<=80000){
			ta=0.07f*bs;
			da=0.05f*bs;
			hra=0.03f*bs;
			gs=bs+ta+da+hra;
		}
		else if(bs>=45000&&bs<60000){
			ta=0.05f*bs;
			da=0.03f*bs;
			hra=0.02f*bs;
			gs=bs+ta+da+hra;
		}
		else if(bs>=30000&&bs<45000){
			ta=0.03f*bs;
			da=0.02f*bs;			
			gs=bs+ta+da;
		}
		else if(bs>=15000&&bs<30000){
			ta=0.02f*bs;		
			gs=bs+ta;
		}
		else if(bs>=8000&&bs<15000){		
			gs=bs;
		}
		else
			System.out.println("You entered a wrong salary");
		System.out.println("Gross Salary is: "+gs);
	}
	
	public static void main(String[] args){
		IfElseLadder lad=new IfElseLadder();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Basic Salary:");
		float bs=sc.nextFloat();
		lad.cal(bs);
		
	}
}