import java.util.Random;
import java.util.Scanner;

public class zavdanya3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("введіть масив: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("початковий масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("введіть значення, яке потрібно знайти: ");
        int valuefind = scanner.nextInt();

        System.out.print("введіть нове значення: ");
        int newvalue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valuefind) {
                array[i] = newvalue;
                found = true;
            }
        }

        if (found) {
            System.out.println("значення замінено");
        } else {
            System.out.println("начення не знайдено у масиві");
        }

        System.out.println("змінений масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
