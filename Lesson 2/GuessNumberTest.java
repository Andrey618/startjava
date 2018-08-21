public class GuessNumberTest {	
	
	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();

		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		game.startGame();
	}
}
		// String response = "да";
		
		// do {
									
		// 	do {
		// 		System.out.print("Хотите продолжить? [да/нет]: ");
		// 		response = scan.next();
		// 	} while ((!response.equals("да")) && (!response.equals("нет")));
			
		// } while(response.equals("да"));
		// System.out.println("Удачи!");

