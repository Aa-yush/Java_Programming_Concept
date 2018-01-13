
/* Program :- Super keyword in Constructor to initialize parent class from subclass 
  
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/

class Vehicle{
	protected int vno;
	protected String vname;
	protected String vpower;
	protected int vgear;
	
	
	public Vehicle(int vno,String vname,String vpower,int vgear){
		this.vno=vno;
		this.vname=vname;
		this.vpower=vpower;
		this.vgear=vgear;
	}	
}

class AdVehicle extends Vehicle{
	int advgear;
	
	public AdVehicle(int vno,String vname,String vpower,int vgear,int advgear){
		super(vno,vname,vpower,vgear);
		this.advgear=advgear;
	}
	public void display(){
		System.out.println("Vehicle Number: "+super.vno);
	}
}


public class SuperInheritance{
	public static void main(String[] args){
	AdVehicle adv=new AdVehicle(2234,"Motorguard","4500cc",5,7);
	adv.display();
	}
}

/*
Output:-
Vehicle Number: 2234

*/