public class Player {
	private String name;
	private int number = 0;
	
	// Конструктор - для инициализации полей объекта валидными 
	// значениями при его создании
	public Player() { 
		// this.name = name; 
	}							 
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
