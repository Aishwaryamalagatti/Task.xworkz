package com.xworkz.war.machines;

import com.xworkz.war.weapons.GunWeapon;

public class MachineGunWeapon implements GunWeapon {
	private int NoOfBullets;

	@Override
	public void damage() {
		System.out.println("overriding damage method from Weapon interface");

	}

	@Override
	public void abort() {
		System.out.println("overriding abort method from Weapon interface");

	}

	@Override
	public void trigger() {
		System.out.println("overriding trigger method from GunWeapon interfaces");
	}

	@Override
	public String toString() {
		System.out.println("invoked toString method");
		return super.toString();
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashCode method");
		return 10;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("obj is not null");
			if (this == obj) {
				return true;
			} else {
				if (obj instanceof MachineGunWeapon) {
					MachineGunWeapon gunWeapon = (MachineGunWeapon) obj;
					if (gunWeapon.getNoOfBullets() == this.NoOfBullets) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private int getNoOfBullets() {
		return NoOfBullets;
	}
}
