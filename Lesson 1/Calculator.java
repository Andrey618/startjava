public class Calculator {	
	
	public static void main(String[] args) {
		int firstNumber = 17;
		int secondNumber = 0;
		char sign = '^';

		if (sign == '+') {
			System.out.println(firstNumber + secondNumber);
		} else if (sign == '-') {
			System.out.println(firstNumber - secondNumber);
		} else if (sign == '*') {
			System.out.println(firstNumber * secondNumber);
		} else if (sign == '/') {
			System.out.println((double)firstNumber / secondNumber);
		} else if (sign == '^') {
			int result = 1;
			for (int i = 1; i <= secondNumber; i++) {
				result *= firstNumber;
			}
			System.out.println(result);
		} else if (sign == '%') {
			System.out.println(firstNumber % secondNumber);
		}
	}
}