package practices;

/*
    [it is a bit harder than what it looks]

    Complete the function that accepts a string parameter, and reverses each word in the string.
    Note: All spaces in the string should be retained.

    "Hello world" -->  "olleH dlrow"
    "a b c d" --> "a b c d"
    "    " --> "    "
    "a" --> "a"
    "  b  fd" --> "  b  df"

 */

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println(revS("  b  fd"));
    }

    private static String revS(String original) {
        String temp = "";

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ' || i == original.length() - 1) {
                for (int j = (i == original.length() - 1 ? original.length() - 1 : i - 1); j >= 0 && original.charAt(j) != ' '; j--) {
                    temp += "" + original.charAt(j);
                }
            }
            if (original.charAt(i) == ' ') {
                temp += ' ';
            }
        }
        return temp;
    }
}
