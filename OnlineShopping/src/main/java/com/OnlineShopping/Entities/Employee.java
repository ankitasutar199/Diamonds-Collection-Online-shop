package com.OnlineShopping.Entities;



	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	@Entity
	public class Employee {
		
		private int empid;
		private String empname;
		private float empsalary;
		private String empposition;
		private String empaddress;
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		
		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public float getEmpsalary() {
			return empsalary;
		}

		public void setEmpsalary(float empsalary) {
			this.empsalary = empsalary;
		}

		public String getEmpposition() {
			return empposition;
		}

		public void setEmpposition(String empposition) {
			this.empposition = empposition;
		}

		public String getEmpaddress() {
			return empaddress;
		}

		public void setEmpaddress(String empaddress) {
			this.empaddress = empaddress;
		}



		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empposition="
					+ empposition + ", empaddress=" + empaddress + "]";
		}
		
		
		

	
}
