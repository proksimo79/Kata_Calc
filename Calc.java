import java.lang.NumberFormatException;
import java.util.Scanner;

public class Calc {
    static Scanner keyboard = new Scanner(System.in);

    public static String calc (String input) throws NumberFormatException {
        String[] array = input.split(" ");

        if (array.length != 3) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(0);
        }

        try {
            int num1 = Integer.parseInt(array[0]);
            int num2 = Integer.parseInt(array[2]);
        } catch (NumberFormatException e) {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(0);
        }
        
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[2]);

        if (num1>10 || num1<-10 || num2>10 || num2<-10) {
            System.out.println("Должны использоваться только числа от 0 до 10");
            System.exit(0);
        }

        int res = 0;
        res = operand(num1, num2, array[1]);
        return Integer.toString(res);
    }
    
    public static int operand (int first, int second, String oper) {
        int result = 0;

        if (oper.equals("+")) {
            result = first + second;
        } else if (oper.equals("-")) {
            result = first - second;
        } else if (oper.equals("*")) {
            result = first * second;
        } else if (oper.equals("/")) {
            if (second == 0) {
                System.out.println("Делить на 0 нельзя");
                System.exit(0);
            }
            result = first / second;
        } else {
            System.out.println("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(0);
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println("Введите пример для решения:");
        System.out.println(calc(keyboard.nextLine()));

    }
}
