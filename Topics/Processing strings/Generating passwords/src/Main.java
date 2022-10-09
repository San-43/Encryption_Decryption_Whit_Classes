import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = readArrayList(scanner);
        List<Character> result = new ArrayList<>();
        Random random = new Random();

        int n = list.get(3) - (list.get(0) + list.get(1) + list.get(2));

        random.ints(66, 90).limit(list.get(0))
                .forEach(a -> addingChar(result, a));
        random.ints(98, 122).limit(list.get(1))
                .forEach(a -> addingChar(result, a));
        random.ints(49, 57).limit(list.get(2))
                .forEach(a -> addingChar(result, a));

        if (n > 0) {
            random.ints(34, 126).limit(n)
                    .forEach(a -> addingChar(result, a));
        }

        for (char s : result) {
            System.out.print(s);
        }
    }

    private static void addingChar(List<Character> result, int a) {
        result.add((char) a);
        for (int i = 0; i < result.size(); i++) {
            try {
                if (result.get(i).equals(result.get(i + 1))) {
                    int temp = a;
                    temp--;
                    result.set(i, (char) temp);
                    break;
                }
            } catch (Exception e) {
                break;
            }
        }
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}