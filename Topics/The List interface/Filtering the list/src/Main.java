import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(readArrayList(scanner));
        ArrayList<Integer> result = removeEvenIndexes(list);

        for (int number : result) {
            System.out.print(number + " ");
        }

    }

    private static ArrayList<Integer> removeEvenIndexes(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}