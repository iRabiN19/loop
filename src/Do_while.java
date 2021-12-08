import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        char choice;
        do {
            Scanner sc = new Scanner(System.in);
            int num, sum = 0;
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            while (num > 0) {
                int rem = num % 10;
                sum = sum + rem;
                num = num / 10;

            }
            System.out.println("The sum of the digits is " + sum);
            System.out.print("Do you want to continue?(y/n): ");
            choice=sc.next().toLowerCase().charAt(0);
        } while (choice=='y');
    }
}
