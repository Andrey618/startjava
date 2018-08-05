public class MyFirstGame {	
	
	public static void main(String[] args) {
		int compNumber = 100;
		int userNumber = 100;
	
		System.out.println("Компьютер загадал число: " + compNumber);				
		while (userNumber != compNumber) {
			if (userNumber < compNumber) {
				System.out.println("Введенное вами число (" + userNumber + ") меньше того, что загадал компьютер");
				userNumber++;
			} else {
				System.out.println("Введенное вами число (" + userNumber + ") больше того, что загадал компьютер");
				userNumber--;
			}
		}
		System.out.println("Вы угадали! Это число: " + compNumber);	
	}
}