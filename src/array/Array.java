package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declares an Array of integers
        int[] arr = new int[5];
        int even=0,odd=0;

        System.out.println("Enter the 5 value: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter an element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 0) {
                even+=1;
            } else {
                odd+=1;
            }
        }

        System.out.println("The number of even numbers is "+even+".");
        System.out.println("The number of odd numbers is "+odd+".");
    }
}
