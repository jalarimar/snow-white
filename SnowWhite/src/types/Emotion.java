package types;

import java.util.Random;

public enum Emotion {
	FEAR ("Eeek!!", "D-<"),ANGER ("Hmph.Grrr.", ":-@"),SADNESS ("Boo hoo", "(:'("),JOY ("Whoo hooo!", ":D"),DISGUST ("Ugh", ":-/"),SURPRISE ("Whoa!! U Say wha??", ":-O"); 
	
	private String sound;
	private String emoticon;
	
	Emotion(String sound, String emoticon){
		this.sound = sound;
		this.emoticon = emoticon;
	}
	
	public String howIfeel(){
		return this.name() + ": " + sound + " " + emoticon;
	}
	
	public static Emotion getRandomEmotion(){
		Emotion[] myEmotions = Emotion.values();
		Random randomNumber = new Random();
		return myEmotions[randomNumber.nextInt(myEmotions.length)];
	}
	
	public String toString(){
		return Emotion.values() + " Emotion";
	}
}
