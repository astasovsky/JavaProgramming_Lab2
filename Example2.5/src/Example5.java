import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер числа Фибоначчи: ");
        int n = scanner.nextInt();

        System.out.println("Число = " + f(n));
    }

    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }
}