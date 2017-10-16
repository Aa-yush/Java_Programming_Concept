
/* Program to understand "Throw keyword "  
*
*Throw- is used to invoke an exception explicitly.
*
*************Our Throw Default Catch*************
*
*/

public class ThrowException2{
	public static void main(String [] args){
		int bal=5000,wAmt=6000;
			if (bal<wAmt)
			throw new ArithmeticException("Insufficient Balalance");
			bal=bal-wAmt;
			System.out.println("Balance is: "+bal);
	}
}
/*
OutPut :-
Exception in thread "main" java.lang.ArithmeticException: Insufficient Balalance
        at ThrowException2.main(ThrowException2.java:7)
*/