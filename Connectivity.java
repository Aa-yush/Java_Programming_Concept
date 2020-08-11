import java.sql.*;

public class Connectivity{
	public static void main(String[] args){
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loader successfully");
		Connection con=DriverManager.getConnection(url,"user","BQIPA7878R");
		System.out.println("Connection Successfully");
		}
		catch(ClassNotFoundException e){
			System.out.println("Driver loader unsuccessfully");
		}
		catch(SQLException e){
			System.out.println("Connection Not established");
		}
	}
}