import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        System.out.print("Enter the starting number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the end number: ");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if(i%2==0){
                 counter++;
            }
        }
        System.out.println("The number of even numbers are "+counter);
    }
}