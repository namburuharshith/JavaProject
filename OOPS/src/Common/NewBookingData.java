package Common;

import java.sql.*;

public class NewBookingData {

   public static void insert(String cus,String reg,String dt,String rd,String tg,String time,int slot) {
		String m = "NO"; 
	    String insert = "INSERT INTO Booking(name,reg,date,ride,insurance,membership,time,slot) VALUES ('"+cus+"','"+reg+"','"+dt+"','"+rd+"','"+tg+"','"+m+"','"+time+"','"+slot+"');";
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
	    Statement st = con.createStatement();
	    
	    int count=st.executeUpdate(insert);
		}catch(Exception e) {
			System.out.println(e);
		}
   }

   public void member(String id,String date,String rb,String time,int slot) {
	
	   String m = "YES";
	   String reg = "";
	   String n = "";
	   String tg = "Yes";
		String select = "SELECT name,regnum FROM Membership WHERE id ='"+id+"';";
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
		    Statement st = con.createStatement();
		    ResultSet rs = st.executeQuery(select);
			if(rs.next()) {
			   n = rs.getString("name");	
			   reg = rs.getString("regnum");
			   System.out.println(n+"    "+reg);
			}
		    }catch(Exception e) {
				System.out.println(e);
			}
		
		
	   String insert = "INSERT INTO Booking(id,date,membership,name,reg,ride,time,slot) VALUES ('"+id+"','"+date+"','"+m+"','"+n+"','"+reg+"','"+rb+"','"+time+"','"+slot+"');";
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
	    Statement st = con.createStatement();
	    
	    int count=st.executeUpdate(insert);
		}catch(Exception e) {
			System.out.println(e);
		}  
   }
}
