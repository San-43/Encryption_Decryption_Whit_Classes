
class Problem {
    public static void main(String[] args) {
        System.out.println(search(args));
    }

    private static int search(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                return i;
            }
        }
        return -1;
    }
}