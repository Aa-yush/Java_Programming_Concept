
/* Program to understand "Throw keyword "  
*
*Throw- is used to invoke an exception explicitly.
*
*************Our Throw Our Catch*************
*
*/

public class ThrowException1{
	public static void main(String [] args){
		int bal=5000,wAmt=6000;
		try{
			if (bal<wAmt)
			throw new ArithmeticException("Insufficient Balalance");
			bal=bal-wAmt;
			System.out.println("Balance is: "+bal);
		}catch(ArithmeticException e){
			System.out.println("Exception: "+e.getMessage());
			}
	}
}
/*
OutPut :-

Exception: Insufficient Balalance

*/