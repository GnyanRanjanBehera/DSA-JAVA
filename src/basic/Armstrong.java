package basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int sum=0;
        int m=n;
        while(n!=0){
            int dig=n%10;
            System.out.println("dig=="+dig);
            sum+=dig*dig*dig;
            n=n/10;
            System.out.println("n=="+n);
        }

        if(sum==m){
            System.out.println(m+" is armstrong number"+sum);
        }else{
            System.out.println(m+" is not armstrong number"+sum);
        }
    }
}
