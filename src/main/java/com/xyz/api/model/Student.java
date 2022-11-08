package com.xyz.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue
	private Integer sId;
	private String sName;
	private String saddress;
	private String sEmail;
	private Integer sPhone;
	private Integer sMarks;
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public Integer getsPhone() {
		return sPhone;
	}
	public void setsPhone(Integer sPhone) {
		this.sPhone = sPhone;
	}
	public Integer getsMarks() {
		return sMarks;
	}
	public void setsMarks(Integer sMarks) {
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", saddress=" + saddress + ", sEmail=" + sEmail
				+ ", sPhone=" + sPhone + ", sMarks=" + sMarks + "]";
	}
	public Student(Integer sId, String sName, String saddress, String sEmail, Integer sPhone, Integer sMarks) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.saddress = saddress;
		this.sEmail = sEmail;
		this.sPhone = sPhone;
		this.sMarks = sMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
