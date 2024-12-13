package basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("palindrom");

        }else {
            System.out.println("not plaindrom");
        }
    }
}
