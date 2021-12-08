package chapter4;

import java.util.Scanner;

public class SimpleInterest {
    public static float simpleInterest(float time, float rate, float principle){
        float interest= principle*time*rate/100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float time,rate,principle;

        System.out.print("Enter the time: ");
        time= sc.nextFloat();
        System.out.print("Enter the rate: ");
        rate= sc.nextFloat();
        System.out.print("Enter the principle: ");
        principle= sc.nextFloat();

        float interest =simpleInterest(time,rate,principle);

        System.out.println("The simple interest is " + interest);
    }
}
