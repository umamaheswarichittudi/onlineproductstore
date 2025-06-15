package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteProductDao {
	int k = 0;

	public int delete(ProductBean pb) {
		// TODO Auto-generated method stub
try {
			
	Class.forName("com.mysql.cj.jdbc.Driver");
			
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
	   
	PreparedStatement st=con.prepareStatement("delete from productbean where Productcode = ?");
	
			
	st.setString(1, pb.getProductcode());
	
	k = st.executeUpdate();
	
	
} catch (Exception e) {
	e.printStackTrace();
}

return k;
}
	}
	

