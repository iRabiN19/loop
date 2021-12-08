import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num,i=0,first=0,second=1;
        System.out.print("Enter a number: ");
        num=sc.nextInt();

        while (i<num){
            System.out.print(first+",");
            int fibonacci=first+second;
            first=second;
            second=fibonacci;
            i++;
        }
    }
}
