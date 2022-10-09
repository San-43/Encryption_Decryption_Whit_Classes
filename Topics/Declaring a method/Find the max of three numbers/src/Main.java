import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        if (a >= b && a >= c) {
            return 1;
        } else if (b >= a && b >= c) {
            return 2;
        }
        return 3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}