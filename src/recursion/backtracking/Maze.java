package recursion.backtracking;

public class Maze {

    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
        printPath("",3,3);

    }
//    Basically it giving matrix so find out the how many ways user can go from source to destination
    static  int countPath(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left=countPath(r-1,c);
        int right=countPath(r,c-1);
        return left+right;

    }

    static void printPath(String p,int r,int c){
        if(c==1&&r==1){
            System.out.println(p);
        }

        if(r>1){
            printPath(p+'D',r-1,c);
        }
        if(c>1){
            printPath(p+'R',r,c-1);
        }
    }
}
