package com.HiberDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aelian {
	@Id
	private int aid;
	private String aname;
	private String acolor;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	
	
}
