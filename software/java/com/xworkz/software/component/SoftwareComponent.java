package com.xworkz.software.component;

public class SoftwareComponent {

	private String name;
	private String vendor;
	private String version;
	private String type;

	public SoftwareComponent(String name, String vendor) {
		super();
		System.out.println("created parameterized constructed");
		System.out.println(name + " is the software developed by " + vendor);
		this.name = name;
		this.vendor = vendor;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		System.out.println("invoked setVersion");
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		System.out.println("invoked setType");
		this.type = type;
	}
}
