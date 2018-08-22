import java.util.Scanner;

public class GuessNumber {	
	Player playerOne;
	Player playerTwo;
	int compNumber = (int) (Math.random() * 100);
	int userNumber;
	int userCounter = 0;
	Scanner scan = new Scanner(System.in);
	boolean gameOver = false;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		System.out.println("\nКомпьютер загадал число: " 
			+ compNumber);	
	
		do {
			System.out.println("\nНачало следующего круга игры Угадай число");
			do {
				workWithPlayer(playerOne);
				userCounter++;
				workWithPlayer(playerTwo);
				userCounter++;
			} while (userCounter % 2 != 0);
			
		} while (gameOver != true);
	}

	public void workWithPlayer (Player player) {
		System.out.print(player.getName() + ", введите число: ");
		userNumber = scan.nextInt();
		if (userNumber == compNumber) {
			System.out.println(player.getName() + ", Вы угадали, это число: " + userNumber);
			gameOver = true;
		} else if (userNumber < compNumber) {
			System.out.println(player.getName() + ", введенное Вами число меньше того, что загадал компьютер");
		} else if (userNumber > compNumber) {
			System.out.println(player.getName() + ", введенное Вами число больше того, что загадал компьютер");
		}
	}
}