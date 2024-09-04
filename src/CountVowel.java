import java.util.Scanner;

//Write a function to count the number of vowels in a string.
public class CountVowel {
    public static void main(String[] args) {
        int vCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Vowel Counting");
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='u' || s.charAt(i)=='e' || s.charAt(i)=='o')
            {vCount++;
            }
        }
        System.out.println("Number of Vowels : " + vCount);

    }
}
