package com.xworkz.methods;
import com.xworkz.methods.electronic.*;

public class SpeakerTester {

	public static void main(String[] args) {

		Speaker speaker=new Speaker("RED",6);
		System.out.println(speaker.getBrandName());
		
		speaker.onOrOff();
		speaker.increaseVolume(); 
		speaker.increaseVolume(); 
		speaker.increaseVolume(); 
		speaker.increaseVolume();
		speaker.increaseVolume(); 


		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();


		
	}

}
