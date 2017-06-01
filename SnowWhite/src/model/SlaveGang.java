// Task 6
package model;

import java.util.ArrayList;
import java.util.List;

import types.Emotion;

public class SlaveGang extends Slave {
	
	private List<Slave> gang = new ArrayList<Slave>();
	
	public SlaveGang(String realName, String slaveName, Integer year) {
		super(realName, slaveName, year);
	}
	
	@Override
	public void add(Slave slave) {
		gang.add(slave);
	}
	
	@Override
	public void remove(Slave slave) {
		gang.remove(slave);
	}
	
	@Override
	public Slave getChild(int index) {
		return gang.get(index);
	}
	
	@Override
	protected void batheFeet() {
		for (Slave slave : gang) {
			slave.batheFeet();
		}
	}

	@Override
	protected void burnIncence() {
		for (Slave slave : gang) {
			slave.burnIncence();
		}
	}

	@Override
	protected void singPraises() {
		for (Slave slave : gang) {
			slave.singPraises();
		}
	}

	@Override
	public void respondToMovement() {
		for (Slave slave : gang) {
			slave.respondToMovement();
		}
	}

	@Override
	protected void respondToTyrantEmotion(Emotion emotion) {
		for (Slave slave : gang) {
			slave.respondToTyrantEmotion(emotion);
		}
	}
	
	@Override
	public void eat(){
		for (Slave slave : gang) {
			slave.eat();
		}
	}
}
//