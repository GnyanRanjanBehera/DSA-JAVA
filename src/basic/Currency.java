package basic;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rupees to convert into dollar");
        float n=sc.nextFloat();
        float result=(n/80);
        System.out.println(n+" rupee is "+result+" dollar");

    }
}
