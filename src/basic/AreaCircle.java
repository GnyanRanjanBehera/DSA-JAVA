package basic;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle r:");
        int r=sc.nextInt();
        double area=3.141*r*r;
        System.out.println("Area of circle is = "+area);


    }
}
