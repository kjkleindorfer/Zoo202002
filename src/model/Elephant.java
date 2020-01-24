package model;

public class Elephant {
	private String name;
	private String Color;
	private int age;
	
	public Elephant() {
		super();
	}
	
	
	
	public Elephant(String name, String color, int age) {
		super();
		this.name = name;
		Color = color;
		this.age = age;
	}


	//Methods
	
	public String speak() {
		return "trumpet!!";
	}
	
	
	//Getters and Setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
