import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		String response = "да";

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setMathOperator(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());

			System.out.println("Получилось: " + calc.calculateResult() + "\n");
			
			do {
				System.out.print("#2 Хотите продолжить? [да/нет]: ");
				response = scan.next();
			} while ((!response.equals("да")) && (!response.equals("нет")));
			
		} while(response.equals("да"));
		System.out.println("Удачи!");
	}
}
