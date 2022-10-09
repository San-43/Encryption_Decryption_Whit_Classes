import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        String numbers = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            sum1 += numbers.charAt(i);
        }
        for (int i = 3; i < 6; i++) {
            sum2 += numbers.charAt(i);
        }

        if (sum1 == sum2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}