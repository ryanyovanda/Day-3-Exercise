import java.util.Scanner;

//Write a function to reverse a string without using built-in reverse functions.
public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to String Reverser");
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        System.out.println("String in Reverse:");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
