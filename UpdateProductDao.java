package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateProductDao {

	int k=0;
	public int update(ProductBean pb) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
		   
		PreparedStatement st=con.prepareStatement("update productbean set ProductPrice = ?, ProductQuantity = ? where Productcode = ?");
		
		st.setDouble(1, pb.getProductPrice());
		st.setInt(2,pb.getProductQuantity());
		st.setString(3, pb.getProductcode());
		
		 k = st.executeUpdate();
		return k;
		
	}
}
