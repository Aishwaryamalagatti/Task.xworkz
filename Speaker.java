package com.xworkz.methods.electronic;

public class Speaker {

	private String brandName="UBL";
	private String color;
	private int batteryBackupInHours;
	
	public boolean connected;
	public int maxVolLevel=4;
	public int minVolLevel=0;
	public int currentVolLevel=0;

	
	public Speaker(String color,int batteryBackupInHours) {
	System.out.println("created Speaker");
	
	this.color=color;
	this.batteryBackupInHours=batteryBackupInHours;
	
	System.out.println("arg 1:"+color);
	System.out.println("arg 2:"+batteryBackupInHours);
	}
	
	public void onOrOff()
	{
		System.out.println("Speaker is :");
		if(this.connected==false)
		{
			this.connected=true;
			System.out.println("Speaker is on");
		}
		else if(this.connected==true)
		{
			this.connected=false;
			System.out.println("Speaker is off");
		}
	}
		public void increaseVolume()
		{
			if(this.connected==true)
			{
				if(this.currentVolLevel<this.maxVolLevel) 
				{
					this.currentVolLevel=this.currentVolLevel+1;
					System.out.println("current volume is:"+this.currentVolLevel);
				}
		else 
		{ System.out.println("max volume level reached");
		}
		}
			else
			{ System.out.println("Speaker is off");
			}
			}
		public void decreaseVolume()
		{
			if(this.connected==true)
			{
				if(this.maxVolLevel>this.minVolLevel)
				{
					this.maxVolLevel=this.maxVolLevel-1;
					System.out.println("Current volume is:"+this.maxVolLevel);
				}
				else
				{ System.out.println("min volume level reached");
				}
			}
				else {
					System.out.println("Speaker is off");
				}
				}	
			
		
	public String getBrandName() {
		return brandName;
	}
	}

	
