package array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declares an Array of integers
        int[] arr = new int[5];
        int sum=0;

        System.out.println("Enter the 5 value: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for index " + i + ": ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of elements is "+sum+".");
    }
}
