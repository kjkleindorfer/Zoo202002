package model;

public class Unicorn {
	private String name;
	private String color;
	private boolean hasMagicalPower;
	
	public Unicorn() {
		super();
		this.name = "";
		this.color = "";
		this.hasMagicalPower = false;
	}

	public Unicorn(String name, String color, boolean hasMagicalPower) {
		super();
		this.name = name;
		this.color = color;
		this.hasMagicalPower = hasMagicalPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getHasMagicalPower() {
		return hasMagicalPower;
	}

	public void setHasMagicalPower(boolean magicalPower) {
		this.hasMagicalPower = magicalPower;
	}

	public String speak() {
		if (hasMagicalPower) {
			return "*magical* Neighhh!";
		}
		else {
			return "Neighhh!";
		}
	}
}
