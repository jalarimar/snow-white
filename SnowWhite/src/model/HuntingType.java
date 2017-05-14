package model;

public abstract class HuntingType {

	private Weapon weapon;
	
	public HuntingType(){
		setWeapon();
	}
	
	// Task 3
	protected abstract Weapon createWeapon();
	
	protected void setWeapon(){
		this.weapon = createWeapon();
	}
	//
	
	public String weaponName(){
		return weapon.toString();
	}
	
	public abstract void hunt();
}
