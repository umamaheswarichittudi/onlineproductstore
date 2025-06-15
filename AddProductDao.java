package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddProductDao {
		
		public int k = 0;
		

	public int insert(ProductBean pb) {
		// TODO Auto-generated method stub
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
			   
			PreparedStatement st=con.prepareStatement("insert into productbean (Productcode,Productname,ProductPrice,ProductQuantity)values (?,?,?,?)");
			st.setString(1, pb.getProductcode());
			st.setString(2, pb.getProductName());
			st.setDouble(3, pb.getProductPrice());
			st.setInt(4, pb.getProductQuantity());
			
			k = st.executeUpdate();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return k;
	}

	
	}
	
	