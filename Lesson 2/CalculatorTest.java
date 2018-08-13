import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {
		String response = "да";

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		while(response.equals("да")) {
			            	
			System.out.print("Введите первое число: ");
			calc.firstNumber = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			calc.mathOperator = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			calc.secondNumber = scan.nextInt();

			System.out.println("Получилось: " + calc.calculateResult());
			System.out.println();
			response = "что-то еще";
			while ((!response.equals("да")) && (!response.equals("нет"))){
				System.out.println("Хотите продолжить? [да/нет]: ");
				response = scan.next();
				// System.out.println("Вы ввели: " + response);
				if (response.equals("нет")) {
					System.out.println("Удачи!");
					break;	
				} else if (response.equals("да")) {
					break;
				} else System.out.println(response + " - это неправильный вариант");				}
			
		}
	}
}
