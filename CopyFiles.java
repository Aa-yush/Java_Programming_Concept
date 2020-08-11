
import java.io.*;

public class CopyFiles{
	public static void main(String [] args ){
	try{
		int i;
		FileInputStream fis=new FileInputStream("From.txt");
		FileOutputStream fout = new FileOutputStream("To.txt");
		
		do{
			i=fis.read();
			if(i!=-1)
				fout.write(i);
			}while(i!=-1);
			
		fis.close();
		fout.close();
	}catch(IOException e){
		System.out.println(e);
	}
	}
}