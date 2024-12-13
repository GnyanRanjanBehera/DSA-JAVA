package basic;

import java.util.Scanner;

public class CLoseX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while (true){
            System.out.println("enter number");
            String n=sc.nextLine();
            if(n.contains("X") || n.contains("x")){
                break;

            }
            if(Integer.parseInt(n)>=0){
                sum+=Integer.parseInt(n);

            }

        }
        System.out.println("sume of the "+sum);

    }
}
