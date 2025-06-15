package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllProductsDao {
	 ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> retrieve() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineproductstore_db", "root" ,"root");
			   
			PreparedStatement st=con.prepareStatement("select * from Productbean");
			

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				ProductBean pb = new ProductBean();

				pb.setProductcode(rs.getString(1));
				pb.setProductName(rs.getString(2));
				pb.setProductPrice(Double.parseDouble(rs.getString(3)));
				pb.setProductQuantity(Integer.parseInt(rs.getString(4)));

				al.add(pb); // Bean added to ArrayList
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return al;
	}
}

	


