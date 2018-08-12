import java.util.Scanner;

public class Calculator {	
	
	public double calcalateResult() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите первое число: ");
		int firstNumber = scan.nextInt();

		System.out.print("Введите знак математической операции: ");
		char mathOperator = scan.next().charAt(0);

		System.out.print("Введите второе число: ");
		int secondNumber = scan.nextInt();
		
		double result = 0;

		switch(mathOperator) {
			case '+': 
				result = firstNumber + secondNumber;
				break;
			case '-': 
				result = firstNumber - secondNumber;
				break;
			case '*': 
				result = firstNumber * secondNumber;
				break;
			case '/': 
				result = (double)firstNumber / secondNumber;
				break;
			case '^': 
				result = 1;
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				break;
			case '%': 
				result = firstNumber % secondNumber;
				break;
		}
		
		return result;
	}
}