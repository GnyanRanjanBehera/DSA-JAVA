package basic;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter second number :");
        int b=sc.nextInt();
        int max=Math.max(a,b);
        int lcm=max;
        while(true){
            if(lcm%a==0&&lcm%b==0){
                System.out.println("lcm is"+lcm);
                break;
            }
            lcm++;
        }

    }
}
