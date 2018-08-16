public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int armour;

	public Jaeger(String modelName, String mark, String origin, 
					float height, float weight, int armour) {
		modelName = modelName;
		mark = mark;
		origin = origin;
		height = height;
		weight = weight;
		armour = armour;
	}

	// public void setModelName(String modelName) {
	// 	modelName = modelName;
	// }

	// public void setMark(String mark) {
	// 	mark = mark;
	// }

	// public void setOrigin(String origin) {
	// 	origin = origin;
	// }

	// public void setHeight(float height) {
	// 	height = height;
	// }

	// public void setWeight(float weight) {
	// 	weight = weight;
	// }

	// public void setArmour(int armour) {
	// 	armour = armour;
	// }

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