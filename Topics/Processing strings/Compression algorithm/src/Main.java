import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s = scanner.nextLine();
        
        char[] c = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < c.length; i++) {
            int count = 1;
            while (i + 1 < c.length && c[i] == c[i + 1]) {
                count++;
                i++;
            }
            stringBuffer.append(c[i]);
            stringBuffer.append(count);
        }

        System.out.println(stringBuffer);
    }
}