import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] c = s.toCharArray();

        System.out.println(Main.substring(c));

    }

    public static boolean substring(char[] c) {
        if (c.length == 1) {
            return true;
        }

        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                break;
            } else if (c[i + 1] - c[i] == 1) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}