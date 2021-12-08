import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num,sum=0;
        System.out.print("Enter a number: ");
        num= sc.nextInt();

        while(num>0){
           int rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        System.out.print("The sum of the digits is "+sum);
    }
}
