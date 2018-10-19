package jdbc;
import java.sql.*;  
public class Proc {  
public static void main(String[] args) throws Exception{   
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Capgemini123");  
CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(1,1011);  
stmt.setString(2,"A");  
stmt.execute();    
System.out.println("success");  
}  
}