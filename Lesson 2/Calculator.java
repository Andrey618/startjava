public class Calculator {	
	
	private int firstNumber;
	private int secondNumber;
	private char sign;
	private double resultValue;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	// public void setFirstNumber(int fn) {	
	// 	firstNumber = fn;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	// public void setSecondNumber(int sn) {
	// 	secondNumber = sn;
	}

	public void setSign(char sign) {
		this.sign = sign;
	// public void setSign(char si) {
	// 	sign = si;
	}

	public double getResult() {
		resultValue = calcalateResult(firstNumber, secondNumber, sign);
		return resultValue;
	}

	private double calcalateResult(int firstNumber, int secondNumber, char sign) {
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
		result = 10;
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