package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student {
	
	@Id
	@GeneratedValue 
	private int sId;
	private String sName;
	private String stCollege;
	
	public int getsId() {
		return sId; 
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getstCollege() {
		return stCollege;
	}

	public void setstCollege(String sCollege) {
		this.stCollege = sCollege;
	}

	@Override
	public String toString() {
		return "student [sId=" + sId + ", sName=" + sName + ", sCollege=" + stCollege + "]";
	}

	

}
