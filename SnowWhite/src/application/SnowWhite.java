package application;

import java.util.Timer;
import java.util.TimerTask;

import model.Adult;
import model.BowArrowHuntingType;
import model.Child;
import model.Dwarf;
import model.Huntsman;
import model.Slave;
import model.SupremacistTyrant;
import model.SwordHuntingType;
import types.Emotion;

public class SnowWhite {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Add your own calls within this method
		
		// create SupremacistTyrant
		final SupremacistTyrant snowWhite = new SupremacistTyrant("Jane Smith", "Snow White");
		final SupremacistTyrant pappaBear = new SupremacistTyrant("Jack Jones", "Pappa Bear");
		
		// create huntsman
		Huntsman hmMark = new Huntsman("Mark", new SwordHuntingType());
		hmMark.hunt();
		hmMark.changeHuntingType(new BowArrowHuntingType());
		hmMark.hunt();
		
		// create slaves
		final Slave georgie = new Adult ("George", "Georgie", 1963);
		final Slave maxine = new Child("Maxine", "Maxie", 2004);
		final Slave sneezy = new Dwarf("Bob", "Sneezy", 1994, "Longbeards");
		final Slave dopey = new Dwarf ("Steve", "Dopey", 1988, "Blacklocks");
		final Slave grumpy = new Dwarf("John", "Grumpy", 1945, "Ironfists");
		snowWhite.addSlave(georgie);
		snowWhite.addSlave(sneezy);
		
	    
		Timer movementTimer = new Timer();
		long shortDelay = 15*1000;
		long shortPeriod = 20*1000;
		long longDelay = 20*1000;
		long longPeriod = 25*1000;
		
		movementTimer.scheduleAtFixedRate (new TimerTask() {
			 @Override
			  public void run() {
			    snowWhite.move();
			    georgie.eat();
			    maxine.eat();
			    sneezy.eat();
			  }
			}, shortDelay, shortPeriod);
		
		movementTimer.scheduleAtFixedRate (new TimerTask() {
			 @Override
			  public void run() {
				snowWhite.hasEmotion(Emotion.getRandomEmotion());
			  }
			}, longDelay, longPeriod);
	}

}