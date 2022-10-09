import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = readArrayList(scanner);
        int n = scanner.nextInt();

        ArrayList<Integer> result = closestsNumbers(list, n);

        result.forEach(x -> System.out.print(x + " "));
    }

    private static ArrayList<Integer> closestsNumbers(ArrayList<Integer> list, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();

        for (int i : list) {
            tmp.add(Math.abs(n - i));
        }

        Collections.sort(tmp);

        for (int i : list) {
            if (Math.abs(n - i) == tmp.get(0)) {
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}