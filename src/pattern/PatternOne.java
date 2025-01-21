package pattern;

public class PatternOne {
    public static void main(String[] args) {
//        pattern1(5,5);
//        pattern2(5);
//        pattern3(5,5);
//        pattern4(5);
//        pattern5(5,5);
//        pattern6(5);
        pattern7(5);

    }

    static void pattern1(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern2(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern4(int row){
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

    }

    static void pattern5(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<row;i++){
            for(int j=0;j<col-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern6(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                    System.out.print(" ");
            }
            for(int k=0;k<=row;k++){
                System.out.print("*");

            }

            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                System.out.print("*");
            }
            for(int k=0;k<row;k++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }

//    static void pattern8(int n){
//        for(int row=0;row<=n;row++){
//            for(int col=0;col<=)
//        }
//    }
}
