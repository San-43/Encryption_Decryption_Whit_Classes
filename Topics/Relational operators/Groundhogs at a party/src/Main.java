import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean result = false;

        if (isWeekend) {
            if (15 <= cups && cups <= 25) {
                result = true;
            }
        } else {
            if (10 <= cups && cups <= 20) {
                result = true;
            }
        }

        System.out.println(result);
    }
}