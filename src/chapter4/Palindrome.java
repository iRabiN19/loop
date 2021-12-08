package chapter4;

import java.util.Scanner;

public class Palindrome {
    public static int palindrome(int number) {
        int reverse = 0;
        while (number > 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        int temp = number;
        int palindrome = palindrome(number);

        if (temp == palindrome) {
            System.out.println(temp + " is a palindrome.");
        } else System.out.println(temp + " is not a palindrome.");
    }
}
