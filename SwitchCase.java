
import java.util.Scanner;
class SwitchCase{
	public static void main(String [] args ){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter digit from 1-5");
		int num=sc.nextInt();
		switch(num){
			case 1:System.out.println("You entered 1");
			break;
			case 2:System.out.println("You entered 2");
			break;
			case 3:System.out.println("You entered 3");
			break;
			case 4:System.out.println("You entered 4");
			break;
			case 5:System.out.println("You entered 5");
			break;
			default: System.out.println("~You entered a wrong digit~");
		}
	}
}