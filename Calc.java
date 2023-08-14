import java.lang.NumberFormatException;
import java.util.Scanner;

public class Calc {
	public static void main(String [] args) throws NumberFormatException {
		System.out.println("Введите пример для решения:");
		Scanner keyboard = new Scanner(System.in);
		String exampl = keyboard.nextLine();
		String[] array = exampl.split(" ");
		keyboard.close();
		
		if (array.length != 3) {
			System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
			System.exit(0);
		}
		
		try {
			int num1 = Integer.parseInt(array[0]);
		} catch (NumberFormatException e) {
			System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
			System.exit(0);
		}
		try {
			int num2 = Integer.parseInt(array[2]);
		} catch (NumberFormatException e) {
			System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
			System.exit(0);
		}
		
		int num1 = Integer.parseInt(array[0]);
		int num2 = Integer.parseInt(array[2]);		
		
		if (num1>10 || num1<-10 || num2>10 || num2<-10) {
			System.out.println("Должны использоваться только одинарные числа");
			System.exit(0);
		}
				
		if (array[1].equals("+")) {
			System.out.println(num1 + num2);
		}
		else if (array[1].equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (array[1].equals("*")) {
			System.out.println(num1 * num2);
		}
		else if (array[1].equals("/")) {
			if (num2 == 0) {
				System.out.println("Делить на 0 нельзя");
				System.exit(0);
			}
			System.out.println(num1 / num2);
		}
		else {
			System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
			System.exit(0);
		}
	}
}
