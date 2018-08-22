public class Calculator {	
	private int firstNumber; 
	private char mathOperator;
	private int secondNumber;
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public void setMathOperator(char mathOperator) {
		this.mathOperator = mathOperator;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

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