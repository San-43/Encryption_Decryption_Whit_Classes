import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] url = scanner.nextLine().split("\\?");
        String[] key = url[1].split("&");

        boolean pass = false;
        String password = null;

        for (String s : key) {
            String[] value = s.split("=");
            if (value.length == 2) {
                if ("pass".equals(value[0])) {
                    pass = true;
                    password = value[1];
                }
                System.out.println(value[0] + " : " + value[1]);
            } else {
                System.out.println(value[0] + " : not found");
            }
        }
        if (pass) {
            System.out.println("password : " + password);
        }
    }
}