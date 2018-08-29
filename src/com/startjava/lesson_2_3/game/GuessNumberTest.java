package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Первый игрок, введите свое имя: ");
		Player playerOne = new Player(scan.next());
		
		System.out.print("Второй игрок, введите свое имя: ");
		Player playerTwo = new Player(scan.next());

		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		
		String response = "да";
		do {
			game.startGame();

			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				response = scan.next();
			} while ((!response.equals("да")) && (!response.equals("нет")));

		} while(response.equals("да"));
		System.out.println("Удачи!");

	}
}

