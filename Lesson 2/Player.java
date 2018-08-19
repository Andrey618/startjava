public class Player {
	private String name;
	private int number = 0;
	
	public Player(String name) {
		this.name = name;
	}

	// public void setName(String name) {
	// 	name = name;
	// }

	public String getName() {
		return name;
	}

	public int getNumber() {
		number = (int) (Math.random() * 100);
		return number;
	}
}
