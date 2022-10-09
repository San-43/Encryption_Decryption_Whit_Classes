import java.util.Scanner;

class Solution {

    public void printIsNull(Object o) {
        if (o == null) {
            System.out.println("It's null");
        } else {
            System.out.println("It's an object");
        }
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}