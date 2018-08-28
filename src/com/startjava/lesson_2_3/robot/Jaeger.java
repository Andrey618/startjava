package com.startjava.lesson_1.robot;

public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int armour;

	public Jaeger(String modelName, String mark, String origin, 
					float height, float weight, int armour) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.armour = armour;
	}

	public String getModelName() {
		return modelName;
	}

	public String getMark() {
		return mark;
	}

	public String getOrigin() {
		return origin;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getArmour() {
		return armour;
	}	
	
	public boolean run() {
		System.out.println("Вы пробежали 10 метров");
		return true;
	}

	public boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}

	public void move() {
		System.out.println("Вы прошли 5 шагов");
	}

	public String scanKiju() {
		return "nothing";
	}

	public String toString() {
		return "Main{" +
			"modelName='" + modelName + '\'' +
			", mark='" + mark + '\'' + 
			", origin='" + origin + '\'' +
			", height=" + height + 
			", weight=" + weight +
			"}";			
	}
}
