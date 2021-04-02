package armycom.xworkz.army.component;

public class ArmyComponent {

	private String countryName;
	private String strength;
	private String type;

	public ArmyComponent(String countryName) {
		super();
		System.out.println("created default constructor");
		System.out.println(countryName);
		this.countryName = countryName;
	}
	
	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getStrength() {
		System.out.println("invoked strength");
		return strength;
	}

	public void setType(String type) {
		System.out.println("invoked setType"+type);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

}
