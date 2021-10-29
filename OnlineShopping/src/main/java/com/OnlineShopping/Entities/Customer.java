package com.OnlineShopping.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {
	private int custid;
	private String custname;
	private Long custmobileno;
	private String custemail;
	private String custaddress;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public Long getCustmobileno() {
		return custmobileno;
	}
	public void setCustmobileno(Long custmobileno) {
		this.custmobileno = custmobileno;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custmobileno=" + custmobileno
				+ ", custemail=" + custemail + ", custaddress=" + custaddress + "]";
	}

}
