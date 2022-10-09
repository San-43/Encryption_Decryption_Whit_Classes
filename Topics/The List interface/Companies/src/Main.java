import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        List<String> lst = Arrays.asList(s.split(" "));

        System.out.println(lst);
    }
}