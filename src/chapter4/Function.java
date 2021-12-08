package chapter4;

import java.util.Scanner;

public class Function {
    public static int addTwoNumber(int first,int second){
        int result= first+second;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first= sc.nextInt();
        System.out.println("Enter the second number: ");
        int second= sc.nextInt();

        int result =addTwoNumber(first,second);
        System.out.println("The sum is " + result);
    }
}
