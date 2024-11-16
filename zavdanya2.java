import java.util.Scanner;

public class zavdanya2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("багатокутник не може мати менше 3 кутів.");
            return;
        }

        int[] angles = new int[n];
        System.out.println("введіть кути багатокутника:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int expectedSum = 180 * (n - 2);

        if (sum == expectedSum) {
            System.out.println("цей багатокутник може існувати");
        } else {
            System.out.println("цей багатокутник не може існувати. сума кутів повинна дорівнювати " + expectedSum);
        }

        scanner.close();
    }
}
