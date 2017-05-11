package model;

import types.Emotion;

public class Dwarf extends Slave {

	private String tribe;
	
	public Dwarf(String realName, String slaveName, Integer yearOfBirth, String tribe) {
		super(realName, slaveName, yearOfBirth);
		this.tribe = tribe;
	}

	public String getTribe(){
		return tribe;
	}
	
	@Override
	protected void batheFeet() {
		System.out.println("  " + getSlaveName() + " is bathing the Tyrant's feet in blessed water aka dwarf urine");

	}

	@Override
	protected void burnIncence() {
		System.out.println("  " + getSlaveName() + " is burning the Sandalwood effigies of the Tyrant");

	}

	@Override
	protected void singPraises() {
		System.out.println("  " + getSlaveName() + " sings: I praise Ding-dong, the witch is dead! Which old witch? The wicked witch!");

	}

	@Override
	public void respondToMovement() {
		System.out.println("  " + getCanonicalName() + ": Coming through. Make way for the Silly and Stupid One!");
	}

	@Override
	protected void respondToTyrantEmotion(Emotion emotion) {
		String myStatement;
		
		switch (emotion){
		case ANGER:
			myStatement = "Mutters: 'Go get angry somerwhere else'.";	
			break;
		case DISGUST:
			myStatement = "Ha. Now you know how I feel when I look at you. Pure disgust!";
			break;
		case FEAR:
			myStatement = "Whispers: 'I smell fear! Tee hee'";
			break;
		case JOY:
			myStatement = "Waving a shovel: I\'ll show you happy!";
			break;
		case SADNESS:
			myStatement = "Yeah boo hoo hoo hoo boo ... whatever. Here, go play the world\'s smallest violin.";
			break;
		case SURPRISE:
			myStatement = "Duh. Only an idiot would be surprised by that.";
			break;
		default:
			myStatement = "What an imbecile!";
			break;
		}
		System.out.println(" " + getCanonicalName() + ": " + " " + myStatement);
	}
	
	@Override
	public void eat(){
		if (isTimeToEat()){
			System.out.println(getSlaveName() + " is eating a set portion of food");
		} else {
			System.out.println("Sorry, it's not yet time for " + getSlaveName() + " to eat");
		}
	}
}