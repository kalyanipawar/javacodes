package jdbc;
import java.sql.*;  
import java.io.*;  
class Transac{  
public static void main(String args[]){  
try{   
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Capgemini123");  
con.setAutoCommit(false);  
  
PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");  
  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
while(true){  
  
System.out.println("enter eid");  
String s1=br.readLine();  
int eid=Integer.parseInt(s1);  
  
System.out.println("enter name");  
String ename=br.readLine();  
 
  
ps.setInt(1,eid);  
ps.setString(2,ename);   
ps.executeUpdate();  
  
System.out.println("commit/rollback");  
String answer=br.readLine();  
if(answer.equals("commit")){  
con.commit();  
}  
if(answer.equals("rollback")){  
con.rollback();  
}  
  
  
System.out.println("Want to add more records y/n");  
String ans=br.readLine();  
if(ans.equals("n")){  
break;  
}  
  
}  
con.commit();  
System.out.println("record successfully saved");  
  
con.close();
}catch(Exception e){System.out.println(e);}  
  
}}