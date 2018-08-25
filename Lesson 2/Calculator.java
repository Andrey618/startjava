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

	public void calculateResult() {
		switch(mathOperator) {
			case '+': 
				System.out.println(firstNumber + secondNumber);
				break;
			case '-': 
				System.out.println(firstNumber - secondNumber);
				break;
			case '*': 
				System.out.println(firstNumber * secondNumber);
				break;
			case '/': 
				System.out.println((double)firstNumber / secondNumber);
				break;
			case '^': 
				pow();
				break;
			case '%': 
				System.out.println(firstNumber % secondNumber);
				break;
			default:
				System.out.println("Ошибка, введен некорректный знак операции!");
		}
	}

	private void pow() {
		int result = 1;
		for (int i = 1; i <= secondNumber; i++) {
			result *= firstNumber;
		}
		System.out.println(result);
	}
}