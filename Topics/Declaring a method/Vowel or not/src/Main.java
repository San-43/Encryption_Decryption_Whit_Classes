import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        char[] temp = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        
        for (int i : temp) {
            if (ch == i) {
                return true;
            }
        }
        
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
