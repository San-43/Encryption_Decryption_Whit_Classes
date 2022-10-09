class Util {
    public static String capitalize(String str) {
        System.out.println("Before: " + str);
        if (str == null || str.isBlank()) {
            System.out.println("After: " + str);
            return str;
        }

        if (str.length() == 1) {
            System.out.println("After: " + str.toUpperCase());
            return str.toUpperCase();
        }
        System.out.println("After: " + Character.toUpperCase(str.charAt(0)) + str.substring(1));
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}