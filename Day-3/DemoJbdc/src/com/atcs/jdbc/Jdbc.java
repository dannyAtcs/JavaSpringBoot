package com.atcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;





public class Jdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create a class for connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atcs", "root", "root");

			if (con != null) {
				System.out.println("connected to database");
				
				Statement st= con.createStatement();
				
				String query="select * from student";
				
//                String insert= "insert into student values(5,'Rahul',178";
//                
//                st.executeUpdate(insert);
                
				
				//insert using prepared statements 
				
				
				PreparedStatement ps = con.prepareStatement("insert into student(id,name,rollno) values(?,?,?)");
				ps.setInt(1, 6);
				ps.setString(2, "Lakshya");
				ps.setInt(3, 180);
				ps.executeUpdate();
				
				
				
                String delete = "delete from student where id=3";
                
                st.executeUpdate(delete);
                
                String update = "update student set rollno=175 where id=4";
                
                st.executeUpdate(update);
				
				ResultSet rs=    st.executeQuery(query);
				
				while(rs.next())
				{
					System.out.println("ID "+rs.getInt(1)  +" name "+rs.getString(2)+" rollno "+rs.getString(3));
					
				}
				
			} else {
				System.out.println("Not connected !");
			}

		} catch (Exception e) {

		}
	}
}
