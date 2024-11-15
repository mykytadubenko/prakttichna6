import java.util.Random;

public class zavdanya1 {
    public static void main(String[] args) {
    int size = 10;
    int[] array = new int[size];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
    array[i] = random.nextInt(100);
}

System.out.println("масив:");
int even = 0, odd = 0;
for (int num : array) {
    System.out.print(num + " ");
    if (num % 2 == 0) {
        even++;
    } else {
        odd++;
    }
}
System.out.println();

System.out.println("кількість парних чисел: " + even);
System.out.println("кількість непарних чисел: " + odd);
}
}
