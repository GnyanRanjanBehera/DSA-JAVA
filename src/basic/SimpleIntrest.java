package basic;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter p :");
        int p=sc.nextInt();
        System.out.println("enter t:");
        int t=sc.nextInt();
        System.out.println("enter r:");
        int r=sc.nextInt();
        int result=(p*t*r)/100;
        System.out.println("Simple interest === "+result);
    }
}
