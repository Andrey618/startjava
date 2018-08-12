public class CalculatorTest {	
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator ();
		calc.setFirstNumber(17);
		calc.setSecondNumber(5);
		calc.setSign('+');

		System.out.println("Test: is main class is working?");

		System.out.println(calc.getResult());

		//System.out.println(firstNumber % secondNumber);
	
	}
}