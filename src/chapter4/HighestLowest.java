package chapter4;


import java.util.Scanner;

public class HighestLowest {
    public static int highest(int first, int second, int third) {
        int highest;
        if (first > second && first > third) {
            highest = first;
        } else if (second > first && second > third) {
            highest = second;
        } else highest = third;
        return highest;
    }

    public static int lowest(int first, int second, int third) {
        int lowest;
        if (first < second && first < third) {
            lowest = first;
        } else if (second < first && second < third) {
            lowest = second;
        } else lowest = third;
        return lowest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second, third;
        System.out.println("Enter the first number: ");
        first = sc.nextInt();
        System.out.println("Enter the second number: ");
        second = sc.nextInt();
        System.out.println("Enter the third number: ");
        third = sc.nextInt();

        int highest = highest(first, second, third);
        int lowest = lowest(first, second, third);

        System.out.println("The highest number is " + highest);
        System.out.println("The lowest number is " + lowest);
    }
}

