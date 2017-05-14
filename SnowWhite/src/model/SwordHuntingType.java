package model;

public class SwordHuntingType extends HuntingType {

	// Task 3
	@Override
	protected Weapon createWeapon() {
		return new Sword();
	}
	//
	
	@Override
	public void hunt() {
		System.out.println("  brandishing a " + weaponName());

	}

}
