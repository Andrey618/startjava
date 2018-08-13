import java.util.Scanner;

public class CalculatorTest {	
	
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Введите первое число: ");
		calc.firstNumber = scan.nextInt();

		System.out.print("Введите знак математической операции: ");
		calc.mathOperator = scan.next().charAt(0);

		System.out.print("Введите второе число: ");
		calc.secondNumber = scan.nextInt();

		System.out.println(calc.calculateResult());
		
		String response = null;

		while(response != "да" | response != "нет") {
			System.out.println("Хотите продолжить? [да/нет]: ");
			response = scan.next();
			System.out.println("Вы ввели: " + response);
			if (response == "да") {
            	System.out.println("вы выбрали да, продолжим ...");
      		} else if (response == "нет") {
				System.out.println("вы выбрали нет, пока!");
			} else {
				System.out.println("вы выбрали неправильный вариант");
			}
		}
	}
}