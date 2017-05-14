package model;

public class BowArrowHuntingType extends HuntingType {

	// Task 3
	@Override
	protected Weapon createWeapon() {
		return new BowAndArrow();
	}
	//
	
	@Override
	public void hunt() {
		System.out.println(" drawing and releasing a " + weaponName());
	}

}
