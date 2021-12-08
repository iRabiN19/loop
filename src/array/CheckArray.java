package array;

import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr= new int[]{69,420,84,55,60};

        System.out.println("Enter the value: ");
        int num=sc.nextInt();
        boolean flag=false;

        for (int i=0;i< arr.length;i++){
            if(num==arr[i]){
                flag=true;
                break;
            }

        }
        if(flag){
            System.out.println("Found.");
        } else System.out.println("Not found.");
    }
}
