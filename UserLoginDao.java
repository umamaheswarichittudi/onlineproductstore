package com.ui;



import java.sql.*;



public class UserLoginDao {

	public UserBean ub = null;
	
	public UserBean login(String uN, String pW)
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
			PreparedStatement ps = con.prepareStatement("select * from UserTab58 where uname = ? and pword = ?");
			
			ps.setString(1, uN);
			ps.setString(2, pW);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				ub = new UserBean();
				
				ub.setUserName(rs.getString(1));
				ub.setPassWord(rs.getString(2));
				ub.setFirstName(rs.getString(3));
				ub.setLastName(rs.getString(4));
				ub.setAddress(rs.getString(5));
				ub.setMailId(rs.getString(6));
				ub.setPhoneNo(rs.getLong(7));				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ub;
	}
}
