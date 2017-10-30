
/* Program to understand "Concept of Thread Synchronization" 
*
*
*Thread Synchronization:- Java Programming Language Provides a very Hardyway to creating threads and synchronizing their task by using synchronization blocks . you keep shared resources within this block.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

import java.util.*;
class Account{
	private int bal;
	public Account(int bal){
		this.bal=bal;
	}
	public boolean isSufficientBalance(int wb){
		if(bal>wb)
			return(true);
		else
			return(false);
	}
	public void withdraw(int wb){
		int balance=bal-wb;
		System.out.println("Withdraw balance= "+wb);
		System.out.println("Current Balance is= "+balance);
	}
}

class Customer implements Runnable{
	private String name;
	private Account account;
	public Customer(Account account, String nm){
		name=nm;
		this.account=account;
	}
	public void run(){
		Scanner sc = new Scanner(System.in);
		synchronized(account){
			System.out.print("Enter the withdraw amount: ");
			int wa=sc.nextInt();
			if(account.isSufficientBalance(wa)){
				System.out.println(name);
				account.withdraw(wa);
			}else
				System.out.println("Insufficient Balance");
		}
	}
}

public class SynchronizedThread{          // synchronized block 
	public static void main(String[] args){
		Account a1=new Account (1000);
		Customer c1=new Customer(a1,"Ayush");
		Customer c2=new Customer(a1,"Seema");
		Thread t1 =new Thread(c1);
		Thread t2 =new Thread(c2);
		t1.start();
		t2.start();
	}
}
/*
Output:-
Enter the withdraw amount: 800
Ayush
Withdraw balance= 800
Current Balance is= 200
Enter the withdraw amount: 700
Seema
Withdraw balance= 700
Current Balance is= 300
*/