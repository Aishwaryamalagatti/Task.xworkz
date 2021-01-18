package com.xworkz.war;

import com.xworkz.war.machines.*;
import com.xworkz.war.weapons.Weapon;

public class WeaponTester {

	public static void main(String[] args) {
		System.out.println("invoked main method");
		
		MachineGunWeapon machineGunWeapon=new MachineGunWeapon();
		machineGunWeapon.abort();
		machineGunWeapon.damage();
		machineGunWeapon.trigger();
		System.out.println(machineGunWeapon.COUNTRY );
		System.out.println("**********************************");
		
		MissileBramhosWeapon missileBramhosWeapon=new MissileBramhosWeapon();
		missileBramhosWeapon.abort();
		missileBramhosWeapon.damage();
		missileBramhosWeapon.dontKonw();
		System.out.println(missileBramhosWeapon.COUNTRY);
		System.out.println("**********************************");
		
		AK47 ak=new AK47();
		ak.abort();
		ak.damage();
		ak.trigger();
		System.out.println(ak.COUNTRY);
		System.out.println("**************************************");
		
		Weapon weapon=new MachineGunWeapon();
		weapon.damage();
		System.out.println(weapon.COUNTRY);
		
		Weapon weapon1=new MissileBramhosWeapon();
		weapon1.abort();
		System.out.println(weapon1.COUNTRY);
		
		
		
	}

}
