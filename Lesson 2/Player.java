public class Player {
	private String name;
	private int number = 0;
	
	public Player(String name) { // Constructor for creating players
		this.name = name;		 // "this" points that name is object field
	}							 // and name is not argument camed in method
	
	public String getName() {
		return name;
	}

	public int getNumber() {
		number = (int) (Math.random() * 100);
		return number;
	}
}
