package com.startjava.lesson_1.calculator;

public class Calculator {	
	
	private int firstNumber;
	private int secondNumber;
	private char sign;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setSign(char firstNumber) {
		this.sign = sign;
	}

	public double getResult() {
		double result = 0;
		if (sign == '+') {
			result = firstNumber + secondNumber;
		} else if (sign == '-') {
			result = firstNumber - secondNumber;
		} else if (sign == '*') {
			result = (firstNumber * secondNumber);
		} else if (sign == '/') {
			result = (double)firstNumber / secondNumber;
		} else if (sign == '^') {
			result = 1;
			for (int i = 1; i <= secondNumber; i++) {
				result *= firstNumber;
			}
		} else if (sign == '%') {
			result = firstNumber % secondNumber;
		}
		return result;
	}





	// public static void main(String[] args) {
	// 	int firstNumber = 17;
	// 	int secondNumber = 0;
	// 	char sign = '^';

	// 	if (sign == '+') {
	// 		System.out.println(firstNumber + secondNumber);
	// 	} else if (sign == '-') {
	// 		System.out.println(firstNumber - secondNumber);
	// 	} else if (sign == '*') {
	// 		System.out.println(firstNumber * secondNumber);
	// 	} else if (sign == '/') {
	// 		System.out.println((double)firstNumber / secondNumber);
	// 	} else if (sign == '^') {
	// 		int result = 1;
	// 		for (int i = 1; i <= secondNumber; i++) {
	// 			result *= firstNumber;
	// 		}
	// 		System.out.println(result);
	// 	} else if (sign == '%') {
	// 		System.out.println(firstNumber % secondNumber);
	// 	}
	// }
}
