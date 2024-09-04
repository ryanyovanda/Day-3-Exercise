import java.util.Scanner;

//Write a program to calculate the sum of digits in a given number.
public class Main {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculate sum of digits");
        System.out.println("Enter your number");
        number = sc.nextInt();
        while (number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }

}
