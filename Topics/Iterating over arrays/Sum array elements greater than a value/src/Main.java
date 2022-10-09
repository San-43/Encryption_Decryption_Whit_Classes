import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int size;
        int sum = 0;
        size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        n = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] > n) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}