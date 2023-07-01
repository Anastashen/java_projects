import java.util.Scanner;

public class task_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner oneNum = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = oneNum.nextDouble();

        Scanner action = new Scanner(System.in);
        System.out.print("Выберите математический оператор (+, -, *, /): ");
        char operator = action.next().charAt(0);

        Scanner twoNum = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        double b = twoNum.nextDouble();
        double res;

        if (operator == '+') {
            res = a + b;
            System.out.println("Ответ: " + res);
        }
        if (operator == '-') {
            if (a > b) {
                res = a - b;
            } else {
                res = b - a;
            }
            System.out.println("Ответ: " + res);
        }
        if (operator == '*') {
            res = a * b;
            System.out.println("Ответ: " + res);
        }
        if (operator == '/') {
            if (a > b) {
                res = a / b;
            } else {
                res = b / a;
            }
            System.out.println("Ответ: " + res);
        }

    }

}
