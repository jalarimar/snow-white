package model;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import types.Emotion;

public abstract class Slave {
	private String realName; 
	private String canonicalName;
	private String slaveName;
	private Integer year; // year of birth, formation, or any other milestone	
	
	public Slave(String realName, String slaveName, Integer year){
		this.realName = realName;
		this.slaveName = slaveName;
		this.canonicalName = this.getClass().getSimpleName() + " " + realName + " " + slaveName;
		this.year = year;
	}
	
	protected abstract void batheFeet();
	protected abstract void burnIncence();
	protected abstract void singPraises();
	
	public void worship(){
		batheFeet();
		burnIncence();
		singPraises();
	}
	
	public String getRealName(){
	 return realName;	
	}
	
	public String getSlaveName(){
		return slaveName;
	}
	
	public String getCanonicalName(){
		return canonicalName;
	}
	
	protected Boolean isTimeToEat(){
		Calendar cal = Calendar.getInstance();
		//int hour = cal.get(Calendar.HOUR_OF_DAY); // Production code
		int hour = cal.get(Calendar.SECOND); // I use SECOND so I don't need to wait during development
		switch(hour) {
		case 9: return true; // breakfast
		case 12: return true; // lunch
		case 18: return true; // tea
		default: return false;
		}
	}
	
	public abstract void eat();
	
	protected Integer getAge(){
		Calendar cal = Calendar.getInstance();
		Integer thisYear = cal.get(Calendar.YEAR);
		return thisYear - year;
	}
	
	public abstract void respondToMovement();
	
	protected abstract void respondToTyrantEmotion(Emotion emotion);

	public String toString(){
		return this.getCanonicalName();
	}
	
	// Task 6
	public void add(Slave slave) {
		// do nothing
	}
	public void remove(Slave slave) {
		// do nothing
	}
	public Slave getChild(int index) {
		// do nothing
		return null;
	}
	//
}
