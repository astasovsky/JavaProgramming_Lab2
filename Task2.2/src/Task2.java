import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.println("Число в двоичной системе счисления: " + ConvertDecimalToBinary(n));
    }

    public static String ConvertDecimalToBinary(int n) {
        return new StringBuilder(ConvertDecimalToInvertedBinary(n)).reverse().toString();
    }

    public static String ConvertDecimalToInvertedBinary(int n) {
        if (n > 1) {
            return (n % 2) + ConvertDecimalToInvertedBinary(n / 2);
        } else {
            return String.valueOf(n);
        }
    }
}
