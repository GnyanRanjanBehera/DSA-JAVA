package basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a:");
        int a=sc.nextInt();
        System.out.println("enter number b:");
        int b=sc.nextInt();
        if(a<b){
            System.out.println(b+" is greater than "+a);
        }else{
            System.out.println(a+" is greater than "+b);
        }
    }
}
