
public class ThrowsKeyword{

	public static void throwone() throws ClassNotFoundException {
		
		throw new ClassNotFoundException("demo");
		
	}
	
	public static void main(String [] args ){
		try{
		throwone();
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}