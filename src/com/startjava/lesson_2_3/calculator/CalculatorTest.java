package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		String response = "да";
		System.out.println("Калькулятор запущен!");

		while(response.equals("да")) {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setMathOperator(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());

			calc.calculateResult();
			
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				response = scan.next();
			} while (!response.equals("да") && !response.equals("нет"));
		} 
	}
}
