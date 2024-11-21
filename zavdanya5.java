import java.util.Scanner;
import java.util.Random;

public class zavdanya5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("введіть масив: ");
        int size = scanner.nextInt();

        System.out.print("перевіряти на зростання 1 чи спадання 2? ");
        int checkType = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            if ((checkType == 1 && array[i] > array[i + 1]) ||
                    (checkType == 2 && array[i] < array[i + 1])) {
                System.out.println(checkType == 1 ? "масив не є зростаючим." : "масив не є спадним.");
                return;
            }
        }

        System.out.println(checkType == 1 ? "масив є зростаючим." : "масив є спадним.");
    }
}
