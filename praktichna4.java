public class praktichna4 {
    public static void main(String[] args) {
        double[] sinValue = new double[91];

        for (int i = 0; i <= 90; i++) {
            sinValue[i] = Math.sin(Math.toRadians(i));
        }

        System.out.println("таблиця синусів для значень від 0 до 90 градусів");
        for (int i = 0; i < sinValue.length; i++) {
            System.out.printf("%8.5f", sinValue[i]);

            if ((i + 1) % 10 == 0 || i == sinValue.length - 1) {
                System.out.println();
            }
        }
    }
}
