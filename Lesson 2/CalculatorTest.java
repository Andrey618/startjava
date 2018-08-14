import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		String response = "да";

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		while(response.equals("да")) {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calc.setMathOperator(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());

			System.out.println("Получилось: " + calc.calculateResult() + "\n");
			
			while ((!response.equals("да")) || (!response.equals("нет"))) {
				System.out.print("Хотите продолжить? [да/нет]: ");
				response = scan.next();
				if (response.equals("нет")) {
					break;	
				} else if (response.equals("да")) {
					break;
				}
				 else System.out.println(response + " - это неправильный вариант \n");				
			}
		}
		System.out.println("Удачи!");
	}
}
