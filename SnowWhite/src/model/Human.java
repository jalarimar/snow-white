package model;

import java.util.Random;

import types.Emotion;

// Task 1
public class Human extends Slave {
//	
	private Random randomGenerator = new Random();

	public Human(String realName, String slaveName, Integer yearOfBirth) {
		super(realName, slaveName, yearOfBirth);
	}

	@Override
	protected void batheFeet() {
		System.out.println("  " + getSlaveName() + " is bathing and powdering the Tyrant's feet");
	}

	@Override
	protected void burnIncence() {
		System.out.println("  " + getSlaveName() + " is burning Agarbatti");
	}

	@Override
	protected void singPraises() {
		System.out.println("  " + getSlaveName() + " chants: praises to the almighty tyrant!");

	}

	private Boolean isHungry(){
		return randomGenerator.nextBoolean();
	}
	
	private Boolean dessert(){
		return randomGenerator.nextBoolean();
	}
	
	@Override
	public void eat(){
		String returnString = "";
		if (isHungry() || isTimeToEat()){
			returnString = getSlaveName() + " is eating.";
			if (dessert()){
				returnString += " Also time for dessert!";
			}
		} else returnString = getSlaveName() + " is not hungry or it is not time to eat.";

		System.out.println(returnString);
	}
	
	@Override
	public void respondToMovement() {
		System.out.println("  " + getCanonicalName() + ": Behold! The Majesty of Majesties is coming!");
	}
	
	@Override
	protected void respondToTyrantEmotion(Emotion emotion) {
		String myStatement;
		switch(emotion){
		case ANGER:
			myStatement = "Quick, let me get my jobs done and get out of the way. The Tyrant is angry.";
			break;
		case DISGUST:
			myStatement = "The tyrant is disgusted. I am a worthless fool.";
			break;
		case FEAR:
			myStatement = "Everyone, hide! You never know how the Tyrant will react due to fear.";
			break;
		case JOY:
			myStatement = "It is now or never; time to take a break while the Tyrant is happy.";
			break;
		case SADNESS:
			myStatement = "I hate seeing the Tyrant sad. I will play 'Que sera, sera' on my violin.";
			break;
		case SURPRISE:
			myStatement = "Oh! Jubilation! What a beautiful surprise!";
			break;
		default:
			myStatement = "I must try hard to be obedient.";
			break;
		}
		System.out.println(" " + getCanonicalName() + ": " + myStatement);
	}
	
	// Task 1
	public Boolean isAbleToDoHeavyWork() {
		Integer age = this.getAge();
		if (age < 14) {
			System.out.println(getSlaveName() + " is not able to do work");
			return false;
		} else {
			System.out.println(getSlaveName() + " is able to do work");
			return true;
		}
	}

	@Override
	public String toString(){
		return "Human " + getRealName();
	}
	//
}
