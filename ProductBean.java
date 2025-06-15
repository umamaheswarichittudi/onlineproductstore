package com.ty;

import java.io.Serializable;
@SuppressWarnings("serial")
public class ProductBean implements Serializable {
	private String Productcode;
	private String ProductName;
	private double ProductPrice;
	private int ProductQuantity;
	public ProductBean() {
		
	}
	public String getProductcode() {
		return Productcode;
	}
	public void setProductcode(String productcode) {
		Productcode = productcode;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}


	
	

}
