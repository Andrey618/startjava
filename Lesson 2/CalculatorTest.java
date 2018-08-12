import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		
		int firstNumber;
		char mathOperator;
		int secondNumber;

		Calculator calc = new Calculator ();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите первое число: ");
		firstNumber = scan.nextInt();

		System.out.print("Введите знак математической операции: ");
		mathOperator = scan.next().charAt(0);

		System.out.print("Введите второе число: ");
		secondNumber = scan.nextInt();

		System.out.println(calc.calcalateResult
			(firstNumber, mathOperator, secondNumber));
	}
}