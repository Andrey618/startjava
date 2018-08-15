public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int armour;

	public void setModelName(String modelName) {
	// if (modelName == "") {
	// 	System.out.println("в переменной: modelName - пустая строка");
	// } else {
		this.modelName = modelName;
		// }
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setArmour(int armour) {
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
}