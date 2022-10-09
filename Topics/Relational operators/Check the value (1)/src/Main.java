import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean truth = n > 0 && n < 10;

        System.out.println(truth);
    }
}