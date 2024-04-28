public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            boolean isAsal = true;

            // Check the integer divisors between 2 and itself.
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }

            // If no divisor is found, the number is considered prime and printed on the screen.
            if (isAsal) {
                System.out.print(i + " ");
            }
        }
    }
}
