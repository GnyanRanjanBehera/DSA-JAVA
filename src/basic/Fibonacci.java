package basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int fib=1;
        int count=0;
        while(n>=fib){
             fib=a+b;
             a=b;
             b=fib;
             count++;

        }

        System.out.println("Number of fibonacci is =="+count);
    }
}
