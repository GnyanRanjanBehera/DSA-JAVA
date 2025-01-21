package basic;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height of the h:");
        float h=sc.nextFloat();
        System.out.println("Enter breadth of the b:");
        float b=sc.nextFloat();
        double area= (double) 1 /2*h*b;
        System.out.println("are aof triangle :"+area);
    }
}
