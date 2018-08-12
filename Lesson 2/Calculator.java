public class Calculator {	
	int firstNumber;
	char mathOperator;
	int secondNumber;
	
	public double calculateResult() {
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