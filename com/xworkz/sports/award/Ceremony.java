package com.xworkz.sports.award;

public class Ceremony {
	private String name;
	private String[] foods;
	
	public Ceremony() {
		System.out.println("created ceremony");
	}
	public Ceremony(String name) {
		this.name=name;
	}
	public void distributeAward(String personName, String award) {
	System.out.println("invoked distributeAward");	
	System.out.println("arg1:"+personName);
	System.out.println("arg2:"+award);
	}
	public void displayFoods() {
		System.out.println("invoked displayFoods");
		System.out.println(this.foods);
		if(this.foods!=null) {
			for(int z=0;z<this.foods.length;z++) {
				String food=this.foods[z];
				System.out.println(food);
			}
		}
	}
	public void displayCeremonyNameAndFoods()
	{
		System.out.println(this.name);
		this.displayFoods();
	}
	public void accessParentmembers()
	{
		int hCode=super.hashCode();
		System.out.println(hCode);
		
		
	}
	public void setFoods(String[] foods) {
		this.foods=foods;
	}

}
