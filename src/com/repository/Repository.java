package com.repository;

import java.sql.*;

public class Repository {
	  public Connection connect() throws SQLException {
		  String url = "";
    	  String name="";
    	  String password = "";
    	  Connection con = DriverManager.getConnection(url, name, password);
		return con;
	  }
	  
	  public String[] getData(String name,String password) throws SQLException {
		  
		 Connection con = connect();
		 Statement st = con.createStatement(); 
		 ResultSet rs = st.executeQuery("select * from user_details where user_name='"+name+"' and password='"+password+"'");
		 String[] ans = new String[2];
		 while(rs.next()) {
			 ans[0] = rs.getString(1);
			 ans[1] = rs.getString(2);
		 }

		 st.close();
		 rs.close();
		 con.close();
		return ans;
	  }
	  
	  public boolean insert(String name,String password) throws SQLException {

		 Connection con = connect();
		 Statement st = con.createStatement();
		 
		  try {
			  st.execute("insert into user_details(user_name,password) values('"+name+"','"+password+"')");
			  return true;
		  }catch(SQLException e) {
			  System.out.print("Failed");
		  }
	     st.close();
		 con.close();
		 return false; 
	  }
     
}
