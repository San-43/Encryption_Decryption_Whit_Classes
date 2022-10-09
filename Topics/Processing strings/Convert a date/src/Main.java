import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] date = scanner.nextLine().split("-");

        System.out.println(date[1] + "/" + date[2] + "/" + date[0]);
    }
}