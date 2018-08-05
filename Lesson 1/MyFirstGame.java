public class MyFirstGame {	
	
	public static void main(String[] args) {
		int compNumber = 65;
		int userNumber = 0;
	
		System.out.println("Компьютер загадал число: " + compNumber);				
		
		if (compNumber == userNumber) {
			System.out.println("Вы угадали с первого раза! Это число: " + userNumber);
		} else {
			while (userNumber != compNumber) {
			if (userNumber < compNumber) {
				System.out.println("Введенное вами число (" + userNumber + ") меньше того, что загадал компьютер");
				userNumber ++;
			} else if (userNumber > compNumber) {
				System.out.println("Введенное вами число (" + userNumber + ") больше того, что загадал компьютер");
				userNumber --;
				}
			}
		System.out.println("Вы угадали! Это число: " + userNumber);	
		}
	}
}		


		// System.out.println("Компьютер загадал число: " + compNumber);				
		
		// if (compNumber == userNumber) {
		// 	System.out.println("Вы угадали! Это число: " + userNumber);
		// } else if (userNumber < compNumber) {
		// 	while (userNumber != compNumber) {
		// 		System.out.println("Введенное вами число (" + userNumber + ") меньше того, что загадал компьютер");
		// 		userNumber ++;
		// 	}
		// 	System.out.println("Вы угадали! Это число: " + userNumber);
		// } else if (userNumber > compNumber) {
		// 	while (userNumber != compNumber) {
		// 		System.out.println("Введенное вами число (" + userNumber + ") больше того, что загадал компьютер");
		// 		userNumber --;
		// 	}
		// 	System.out.println("Вы угадали! Это число: " + userNumber);	
		// }
			

	