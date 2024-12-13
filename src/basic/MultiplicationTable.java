package basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number :");
        int n=sc.nextInt();
        int count=1;
        while(count <= 10){
            System.out.println(n+"*"+count+"=="+n*count);
            count++;
        }
    }
}
