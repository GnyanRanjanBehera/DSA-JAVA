package basic;

import java.util.Scanner;

public class LeapYear {

   public static  boolean isLeapYear(int year){
       if(year%4==0){
           if(year%100==0){
               return year%400==0;
           }
           return true;

       }
       return false;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        boolean isYear=isLeapYear(year);
        if(isYear){
            System.out.println(year+"  is Leap Year");
        }else{
            System.out.println(year+"  is not leap year");
        }
    }
}
