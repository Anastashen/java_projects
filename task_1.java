
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = number.nextInt();
        int summ = 1;
        for (int i = 1; i < n + 1; i++) {
            summ = summ * i;
        }
        System.out.println(summ);
    }
}
