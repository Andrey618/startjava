import java.util.Scanner;

public class GuessNumber {	
	Player playerOne;
	Player playerTwo;
	int compNumber = (int) (Math.random() * 100);
	int userNumber;
	int userCounter = 0;
	Scanner scan = new Scanner(System.in);

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
				System.out.print("Введите число: ");
				userNumber = scan.nextInt();
				if (userNumber == compNumber) {
					System.out.println("Вы угадали, это число: " + userNumber);
					break;
				} else if (userNumber < compNumber) {
					System.out.println("Введенное число меньше того, что загадал компьютер");
				} else if (userNumber > compNumber) {
					System.out.println("Введенное число больше того, что загадал компьютер");
				}
				userCounter++;
			} while (userCounter % 2 != 0);
		} while (userNumber != compNumber);
	}
}

// do {
// 			do {
// 				System.out.println("\nНачало следующего круга игры Угадай число");
				
// 				System.out.print("Первый игрок, введите число: ");
// 				playerOne.setNumber(scan.nextInt());
				
// 				System.out.print("Второй игрок, введите число: ");
// 				playerTwo.setNumber(scan.nextInt());
				
// 				userNumber = playerOne.getNumber();
// 				System.out.println("Игрок: " + playerOne.getName() +
// 					" загадал число: " + userNumber);
// 				if (userNumber == compNumber) {
// 						System.out.println("Игрок: " + playerOne.getName() +
// 					" угадал, это число: " + userNumber);
// 				} else if (userNumber < compNumber) {
// 					System.out.println("Введенное игроком: " + playerOne.getName() 
// 						+ " число меньше того, что загадал компьютер");
// 				} else if (userNumber > compNumber) {
// 					System.out.println("Введенное игроком: " + playerOne.getName() 
// 							+ " число больше того, что загадал компьютер");
// 				}
// 				userCounter++;

// 				userNumber = playerTwo.getNumber();
// 				System.out.println("Игрок: " + playerTwo.getName() +
// 					" загадал число: " + userNumber);
// 				if (userNumber == compNumber) {
// 						System.out.println("Игрок: " + playerTwo.getName() +
// 					" угадал, это число: " + userNumber);
// 				} else if (userNumber < compNumber) {
// 					System.out.println("Введенное игроком: " + playerTwo.getName() 
// 						+ " число меньше того, что загадал компьютер");
// 				} else if (userNumber > compNumber) {
// 					System.out.println("Введенное игроком: " + playerTwo.getName() 
// 							+ " число больше того, что загадал компьютер");
// 				}
// 				userCounter++;
				
// 			} while (userCounter <= 2);

// 		} while (userNumber != compNumber);