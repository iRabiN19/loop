package chapter4;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        String result=odd(num);
        System.out.println(result);
    }

    public static String odd(int num){
        if(num%2==0){
            return "it is even";

        }
        else {
            return "it is odd";
        }
    }

}