/* Program to understand "Concept of Polymorphism"  
*
*
*
* Polymorphism : polymorphism is the capability of a method to do different things based on the object through which is invoked or object it is acting upon.
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

abstract class Player{
	protected String name;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public abstract void play();
}
class Cricket extends Player{
	public Cricket(String nm){
		setName(nm);		
	}
	public void play(){
		System.out.println("Cricket Player: "+getName());
	}
}

class Hockey extends Player{
	public Hockey(String nm){
		setName(nm);		
	}
	public void play(){
		System.out.println("Hockey Player: "+getName());
	}
}

class Football extends Player{
	public Football(String nm){
		setName(nm);		
	}
	public void play(){
		System.out.println("Football Player: "+getName());
	}
}

public class Polymorphism{
	public static void main(String[] args){
	Player p1;
	Cricket c1=new Cricket("Ayush Gupta");
	Hockey h1=new Hockey("Pawan Kumar");
	Football f1=new Football("Vivek Singh");
	p1=c1;
	p1.play();
	p1=h1;
	p1.play();
	p1=f1;
	p1.play();
	}
}
/* 
OutPut:- 
Cricket Player: Ayush Gupta
Hockey Player: Pawan Kumar
Football Player: Vivek Singh
*/