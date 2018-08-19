public class GuessNumber {	
	Player playerOne = new Player("Mr. First");
	Player playerTwo = new Player("Mr. Second");
	
	int compNumber = (int) (Math.random() * 100);
	int userNumber;
	int userCounter = 1;

	public void startGame() {
		System.out.println("\nКомпьютер загадал число: " 
			+ compNumber);	

		do {
			do {
				System.out.println("\nНачало следующего круга игры Угадай число");
				userNumber = playerOne.getNumber();
				System.out.println("Игрок: " + playerOne.getName() +
					" загадал число: " + userNumber);
				if (userNumber == compNumber) {
						System.out.println("Игрок: " + playerOne.getName() +
					" угадал, это число: " + userNumber);
				} else if (userNumber < compNumber) {
					System.out.println("Введенное игроком: " + playerOne.getName() 
						+ " число меньше того, что загадал компьютер");
				} else if (userNumber > compNumber) {
					System.out.println("Введенное игроком: " + playerOne.getName() 
							+ " число больше того, что загадал компьютер");
				}
				userCounter++;

				userNumber = playerTwo.getNumber();
				System.out.println("Игрок: " + playerTwo.getName() +
					" загадал число: " + userNumber);
				if (userNumber == compNumber) {
						System.out.println("Игрок: " + playerTwo.getName() +
					" угадал, это число: " + userNumber);
				} else if (userNumber < compNumber) {
					System.out.println("Введенное игроком: " + playerTwo.getName() 
						+ " число меньше того, что загадал компьютер");
				} else if (userNumber > compNumber) {
					System.out.println("Введенное игроком: " + playerTwo.getName() 
							+ " число больше того, что загадал компьютер");
				}
				userCounter++;
				
			} while (userCounter <= 2);

		} while (userNumber != compNumber);
	}
}

// 	this is worked:
// System.out.println("Первого игрока зовут " + playerOne.getName());
// System.out.println("Первый игрок загадал " + playerOne.getNumber());
// System.out.println("Второго игрока зовут " + playerTwo.getName());
// System.out.println("Второй игрок загадал " + playerTwo.getNumber());

// int compNumber = 100;
// 		int userNumber = 100;
	
// 		System.out.println("Компьютер загадал число: " + compNumber);				
// 		while (userNumber != compNumber) {
// 			if (userNumber < compNumber) {
// 				System.out.println("Введенное вами число (" + userNumber + ") меньше того, что загадал компьютер");
// 				userNumber++;
// 			} else {
// 				System.out.println("Введенное вами число (" + userNumber + ") больше того, что загадал компьютер");
// 				userNumber--;
// 			}
// 		}
// 		System.out.println("Вы угадали! Это число: " + compNumber);	