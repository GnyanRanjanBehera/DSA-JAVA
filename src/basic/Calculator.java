package basic;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a");
        int a=sc.nextInt();
        System.out.println("Enter number b");
        int b=sc.nextInt();
        System.out.println("enter operator");
        char op=sc.next().charAt(0);
        int result;
        if(op=='+'){
            result=a+b;
        }else if(op=='-'){
            result=a-b;

        } else if (op == '*') {
            result=a*b;
        } else if (op == '%') {
            result=a%b;
        }else {
            result=a/b;
        }
        System.out.println("Result is == "+result);
    }
}
