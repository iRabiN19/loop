import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,reverse=0;
        System.out.print("Enter a number: ");
        num= sc.nextInt();
        int temp=num;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println("The reverse is " +reverse +".");
        if(temp==reverse){
            System.out.println(temp+" is a palindrome.");
        } else System.out.println(temp+" is not a palindrome.");
    }
}
