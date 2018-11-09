package Common;

import java.sql.*;

public class SinupData {

	public static void insert(String usr,String pass) {
		
	    String insert = "INSERT INTO Sinup(name,password) VALUES ('"+usr+"','"+pass+"');";
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
	    Statement st = con.createStatement();
	    
	    int count=st.executeUpdate(insert);
	    // ResultSet rs = st.executeQuery(insert);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
