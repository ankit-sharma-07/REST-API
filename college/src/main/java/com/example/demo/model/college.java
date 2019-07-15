package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class college {
	@Id
	@GeneratedValue
	private int cId;
	private String cName;
	private String cRcity;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcMcity() {
		return cRcity;
	}
	public void setcMcity(String cMcity) {
		this.cRcity = cMcity;
	}
	@Override
	public String toString() {
		return "college [cId=" + cId + ", cName=" + cName + ", cMcity=" + cRcity + "]";
	}

}
