package com.ty;

import java.io.Serializable;

public class AdminBean implements Serializable {
	private String uname;
	private String Password;
	private String fname;
	private String lnmae;
	private String Addrs;
	private String Mailid;
	public AdminBean() {
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLnmae() {
		return lnmae;
	}
	public void setLnmae(String lnmae) {
		this.lnmae = lnmae;
	}
	public String getAddrs() {
		return Addrs;
	}
	public void setAddrs(String addrs) {
		Addrs = addrs;
	}
	public String getMailid() {
		return Mailid;
	}
	public void setMailid(String mailid) {
		Mailid = mailid;
	}
	

}
