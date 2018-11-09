package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MembershipData {

	public void input(String name,String id,String regnum,Long ph,String date) {
		
		String insert = "INSERT INTO Membership (name,id,regnum,phnum,date) VALUES ('"+name+"','"+id+"','"+regnum+"','"+ph+"','"+date+"');";
		try {
			System.out.println(name);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject","namburuharshith","Alivelu@735");
	    Statement st = con.createStatement();
	    
	    int count=st.executeUpdate(insert);
	    }catch(Exception e) {
			System.out.println(e);
		}
	}
}
