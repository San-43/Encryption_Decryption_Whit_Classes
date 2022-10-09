import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int c = scanner.nextInt();
        int b = scanner.nextInt();
        int a = scanner.nextInt();

        if (a + b > c && c + b > a && a + c > b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}