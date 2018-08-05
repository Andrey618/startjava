public class MyFirstGame {	
	
	public static void main(String[] args) {
		int compNumber = 65;
		int userNumber = 50;
	
		System.out.println("Компьютер загадал число: " + compNumber);				
		
		if (compNumber == userNumber) {
			System.out.println("Вы угадали! Это число: " + userNumber);
		} else if (userNumber < compNumber) {
			while (userNumber != compNumber) {
				System.out.println("Введенное вами число (" + userNumber + ") меньше того, что загадал компьютер");
				userNumber ++;
			}
			System.out.println("Вы угадали! Это число: " + userNumber);
		} else if (userNumber > compNumber) {
			while (userNumber != compNumber) {
				System.out.println("Введенное вами число (" + userNumber + ") больше того, что загадал компьютер");
				userNumber --;
			}
			System.out.println("Вы угадали! Это число: " + userNumber);	
		}
			
	}
}
	