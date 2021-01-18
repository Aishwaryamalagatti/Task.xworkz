package com.xworkz.war.machines;

import com.xworkz.war.weapons.BrahmosWeapon;

public class MissileBramhosWeapon implements BrahmosWeapon,Cloneable {
	

	@Override
	public void damage() {
		System.out.println("overriding damage method from Weapon interface");
	}

	@Override
	public void abort() {
		System.out.println("overriding abort method from Weapon interface");
	}

	@Override
	public void dontKonw() {
		System.out.println("overriding dontKonw method from BrahmosWeapon interface");
	}
	@Override
	protected MissileBramhosWeapon clone() throws CloneNotSupportedException {
		System.out.println("invoked clone method");
		return (MissileBramhosWeapon)super.clone();
	}

}
