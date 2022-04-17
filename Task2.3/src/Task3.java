import java.util.Scanner;

public class Task3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];

        System.out.println("Введите элементы массива: ");
        InputArray(array);

        System.out.println("Введенный массив: ");
        ShowArray(array);
    }

    public static void InputArray(int[] array) {
        InputArray(array, 0);
    }

    private static void InputArray(int[] array, int startIndex) {
        if (startIndex < array.length) {
            array[startIndex] = scanner.nextInt();
            InputArray(array, startIndex + 1);
        }
    }

    public static void ShowArray(int[] array) {
        ShowArray(array, 0);
    }

    private static void ShowArray(int[] array, int startIndex) {
        if (startIndex < array.length) {
            System.out.print(array[startIndex] + " ");
            ShowArray(array, startIndex + 1);
        }
    }
}
