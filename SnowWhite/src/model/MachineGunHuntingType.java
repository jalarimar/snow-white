package model;

public class MachineGunHuntingType extends HuntingType {

	// Task 3
	@Override
	protected Weapon createWeapon() {
		return new MachineGun();
	}
	//
	
	@Override
	public void hunt() {
		System.out.println("  firing: " + weaponName());
	}

}
