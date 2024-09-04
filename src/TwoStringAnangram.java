import java.util.Arrays;
import java.util.Scanner;

//Create a function to check if two strings are anagrams.
public class TwoStringAnangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first Text");
        String s1 = sc.nextLine();

        System.out.println("Input second Text");
        String s2 = sc.nextLine();

        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are Anagram");
        } else {
            System.out.println(s1 + " and " + s2 + "are Not Anagram");
        }


    }


}
