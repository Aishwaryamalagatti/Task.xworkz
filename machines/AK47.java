package com.xworkz.war.machines;

public class AK47 extends MachineGunWeapon{
	
	@Override
	public void trigger() {
		System.out.println("invoked trigger method");
		super.trigger();
	}
}
