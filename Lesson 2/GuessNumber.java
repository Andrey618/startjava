public class GuessNumber {	
	Player playerOne = new Player("Mr. First");
	Player playerTwo = new Player("Mr. Second");
	
	public void startGame() {
		System.out.println("Первого игрока зовут " + playerOne.getName());
		System.out.println("Первый игрок загадал " + playerOne.getNumber());
		System.out.println("Второго игрока зовут " + playerTwo.getName());
		System.out.println("Второй игрок загадал " + playerTwo.getNumber());
	}
}


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