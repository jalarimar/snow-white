package model;

import java.util.HashSet;
import java.util.Set;

import types.Emotion;

public class SupremacistTyrant {
	private String realName;
	private String embellishedName;
	private Set <Slave>mySlaves = new HashSet<Slave>();
	
	public SupremacistTyrant(String realName, String embellishedName){
		this.realName = realName;
		this.embellishedName = embellishedName;
	}
	
	public String getRealName(){
		return realName;
	}
	
	public String getEmbellishedName(){
		return embellishedName;
	}
	
	public void move(){
		System.out.println(getEmbellishedName() + " is moving!");
		notifySlavesOfMovement();
	}
	
	public void hasEmotion(Emotion emotion){
		System.out.println(this.getRealName() + " feels " + emotion.howIfeel());
		notifySlavesOfEmotion(emotion);
		
	}
	
	public void notifySlavesOfMovement(){
		for (Slave slave: mySlaves){
			slave.respondToMovement();
		}
	}

	protected void notifySlavesOfEmotion(Emotion emotion){
		for (Slave slave: mySlaves){
			slave.respondToTyrantEmotion(emotion);
		}
	}
	
	public void addSlave(Slave slave){
		mySlaves.add(slave);
	}
	
	public void removeSlave(Slave slave){
		mySlaves.remove(slave);
	}
	
	public String toString(){
		return this.getClass() + "; realName: " + getRealName() + ", embellished name: " + getEmbellishedName();
	}
}
