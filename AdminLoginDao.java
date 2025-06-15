package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class AdminLoginDao {
	public AdminBean ab = null;
	public AdminBean login(String uN, String pW) throws SQLException, ClassNotFoundException {
   
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
		   
		PreparedStatement st=con.prepareStatement("select * from adminbean where username = ? and password = ?");
		
		st.setString(1, uN);
		st.setString(2, pW);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			ab = new AdminBean();
			ab.setUname(rs.getString(1));
			ab.setPassword(rs.getString(2));
			ab.setFname(rs.getString(3));
			ab.setLnmae(rs.getString(4));
			ab.setAddrs(rs.getString(5));
			ab.setMailid(rs.getString(6));
		}
		return ab;
	}

}
