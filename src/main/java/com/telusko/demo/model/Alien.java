package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	private String atech;
	
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
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	@Override
	public String toString() {
		return "Employee Details -> ID =" + aid + ", Name =" + aname + ", Technology= "+atech;
	}
	
}
